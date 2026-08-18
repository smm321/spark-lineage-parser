package com.shopee.warehouse.sqlparser.engine.spark.helper

import org.apache.spark.sql.catalyst.analysis.NamedRelation
import org.apache.spark.sql.catalyst.catalog.{CatalogTable, HiveTableRelation}
import org.apache.spark.sql.catalyst.expressions._
import org.apache.spark.sql.catalyst.plans.logical._
import org.apache.spark.sql.execution.datasources.LogicalRelation
import org.apache.spark.sql.execution.datasources.v2.{DataSourceV2Relation, DataSourceV2ScanRelation}

import scala.collection.mutable

object AttributeLineage {
  val default_catalog = "spark_catalog"

  private def getV1TableName(qualifiedName: String): String = {
    qualifiedName.split("\\.") match {
      case Array(database, table) =>
        Seq(default_catalog, database, table).filter(_.nonEmpty).mkString(".")
      case _ => qualifiedName
    }
  }

  private def getV2TableName(plan: NamedRelation): String = {
    plan match {
      case relation: DataSourceV2ScanRelation =>
        val catalog = relation.relation.catalog.map(_.name()).getOrElse(default_catalog)
        val database = relation.relation.identifier.get.namespace().mkString(".")
        val table = relation.relation.identifier.get.name()
        s"$catalog.$database.$table"
      case relation: DataSourceV2Relation =>
        val catalog = relation.catalog.map(_.name()).getOrElse(default_catalog)
        val database = relation.identifier.get.namespace().mkString(".")
        val table = relation.identifier.get.name()
        s"$catalog.$database.$table"
      case _ =>
        plan.name
    }
  }

  def findSourceAttributes(attrRef: AttributeReference, plan: LogicalPlan): Set[String] = {
    val result = mutable.Set.empty[String]
    val collected = mutable.Set.empty[AttributeReference]
    if (attrRef == null || plan == null) return Set.empty

    val rootPlan = plan

    def resolveInPlan(currentAttr: AttributeReference, currentPlan: LogicalPlan, fromRootResolve: Boolean = false): Unit = {
      if (currentPlan == null || currentAttr == null) return

      val targetId = currentAttr.exprId
      if (targetId == null) {
        collected.add(currentAttr)
        return result
      }

      currentPlan match {
        case p: Project =>
          p.child match {
            case null => ()
            case child =>
              p.projectList.foreach { expr =>
                outputAttribute(expr).foreach { outAttr =>
                  if (sameExprId(outAttr, targetId)) {
                    collectSourceAttributes(expr, child, rootPlan, collected, (ar, pl) => resolveInPlan(ar, pl, fromRootResolve))
                    return
                  }
                }
              }
          }

        case s: SubqueryAlias =>
          resolveInPlan(currentAttr, s.child, fromRootResolve)

        case f: Filter =>
          resolveInPlan(currentAttr, f.child, fromRootResolve)

        case j: Join =>
          if (j.left != null && planOutputContains(j.left, targetId)) {
            resolveInPlan(currentAttr, j.left, fromRootResolve)
          }
          if (j.right != null && planOutputContains(j.right, targetId)) {
            resolveInPlan(currentAttr, j.right, fromRootResolve)
          }

        case u: Union =>
          u.children.find(c => planOutputContains(c, targetId)).foreach { child =>
            resolveInPlan(currentAttr, child, fromRootResolve)
          }

        case a: Aggregate =>
          a.child match {
            case null => ()
            case child =>
              val matched = (a.groupingExpressions ++ a.aggregateExpressions).find { expr =>
                outputAttribute(expr).exists(outAttr => sameExprId(outAttr, targetId))
              }
              matched.foreach(expr => collectSourceAttributes(expr, child, rootPlan, collected, (ar, pl) => resolveInPlan(ar, pl, fromRootResolve)))
          }

        case _ if isLeafNode(currentPlan) =>
          planOutputAttributes(currentPlan).foreach { a =>
            if (sameExprId(a, targetId)) {
              val ar = a.asInstanceOf[AttributeReference]
              val columnName = currentPlan.output.find(a => a.exprId == targetId).getOrElse("")
                collected.add(ar)
                currentPlan match {
                  case relation: LogicalRelation =>
                    result.add(getQualifiedSourceColumn(ar, relation))
                  case relation: HiveTableRelation =>
                    val tableName = getV1TableName(relation.tableMeta.qualifiedName)
                    result.add(tableName + "." + columnName)
                  case relation: DataSourceV2ScanRelation =>
                    val tableName = getV2TableName(relation)
                    result.add(tableName + "." + columnName)
                  case relation: DataSourceV2Relation =>
                    val tableName = getV2TableName(relation)
                    result.add(tableName + "." + columnName)
                  case _ =>
                }
              }
          }

        case e: Expand =>
          e.child match {
            case null => ()
            case child =>
              val projs = e.projections
              val out   = e.output
              for (i <- out.indices if sameExprId(out(i), targetId)) {
                projs.foreach { row =>
                  if (row.length > i) collectSourceAttributes(row(i), child, rootPlan, collected, (ar, pl) => resolveInPlan(ar, pl, fromRootResolve))
                }
                return
              }
          }

        case other =>
          val children = other.children
          if (children.size == 1) {
            resolveInPlan(currentAttr, children.head, fromRootResolve)
          }
      }
    }
    resolveInPlan(attrRef, plan, fromRootResolve = false)
    result.toSet
  }

  private def outputAttribute(expr: Expression): Option[AttributeReference] = expr match {
    case null => None
    case a: Alias => Some(a.toAttribute.asInstanceOf[AttributeReference])
    case ar: AttributeReference => Some(ar)
    case _ => None
  }

  private def sameExprId(attr: Attribute, exprId: ExprId): Boolean = {
    if (attr == null || exprId == null) return false
    val aid = attr.exprId
    if (aid == null) return false
    aid == exprId
  }

  def getQualifiedSourceColumn(attrRef: AttributeReference, lr: LogicalRelation): String = {
    if (attrRef == null || lr == null) return ""
    val catalogTable: CatalogTable = lr.catalogTable.getOrElse(return "")
    val targetId = attrRef.exprId
    if (targetId == null) return ""

    val matched = lr.output.find(a => a.exprId == targetId)
    matched match {
      case None => ""
      case Some(col) =>
        val id = catalogTable.identifier
        val catalog = catalogName(catalogTable)
        val database = id.database.getOrElse("default")
        val table = id.table
        s"$catalog.$database.$table.${col.name}"
    }
  }

  private def catalogName(ct: CatalogTable): String = "spark_catalog"

  private def planOutputContains(plan: LogicalPlan, exprId: ExprId): Boolean =
    planOutputAttributes(plan).exists(a => sameExprId(a, exprId))

  private def planOutputAttributes(plan: LogicalPlan): Seq[Attribute] = {
    plan.output
  }

  private def isLeafNode(plan: LogicalPlan): Boolean = plan.children.isEmpty

  private def collectSourceAttributes(
                                       expr: Expression,
                                       childPlan: LogicalPlan,
                                       rootPlan: LogicalPlan,
                                       collected: mutable.Set[AttributeReference],
                                       resolveFn: (AttributeReference, LogicalPlan) => Unit): Unit = {
    if (expr == null) return

    expr match {
      case ar: AttributeReference =>
        val childOutput = planOutputAttributes(childPlan)
        if (childOutput.exists(a => sameExprId(a, ar.exprId))) {
          resolveFn(ar, childPlan)
        } else {
          resolveFn(ar, rootPlan)
        }

      case a: Alias =>
        collectSourceAttributes(a.child, childPlan, rootPlan, collected, resolveFn)

      case other =>
        other.children.foreach(c => collectSourceAttributes(c, childPlan, rootPlan, collected, resolveFn))
    }
  }
}

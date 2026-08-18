/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shopee.warehouse.sqlparser.engine.spark.helper

import com.shopee.warehouse.sqlparser.Lineage
import org.apache.hadoop.fs.Path

import scala.collection.immutable.ListMap
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.TableIdentifier
import org.apache.spark.sql.catalyst.analysis.{NamedRelation, PersistedView, ViewType}
import org.apache.spark.sql.catalyst.catalog.{CatalogStorageFormat, CatalogTable, HiveTableRelation}
import org.apache.spark.sql.catalyst.expressions.{Alias, And, Attribute, AttributeReference, AttributeSet, BinaryComparison, BinaryExpression, BinaryOperator, Cast, EqualTo, Exists, Explode, Expression, GreaterThan, In, InSubquery, IsNull, Like, ListQuery, Literal, NamedExpression, Not, OuterReference, Predicate, RLike, ScalarSubquery, StringRegexExpression, TernaryExpression, UnaryExpression}
import org.apache.spark.sql.catalyst.expressions.aggregate.{AggregateExpression, Count}
import org.apache.spark.sql.catalyst.plans.logical._
import org.apache.spark.sql.connector.catalog.{CatalogPlugin, Identifier, TableCatalog}
import org.apache.spark.sql.execution.SparkPlan
import org.apache.spark.sql.execution.columnar.InMemoryRelation
import org.apache.spark.sql.execution.datasources.LogicalRelation
import org.apache.spark.sql.execution.datasources.v2.{DataSourceV2Relation, DataSourceV2ScanRelation}
import org.apache.kyuubi.plugin.lineage.helper.SparkListenerHelper.SPARK_RUNTIME_VERSION
import org.apache.kyuubi.util.reflect.ReflectUtils._
import org.apache.spark.internal.Logging

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.HashSet

trait LineageParser {
  def sparkSession: SparkSession
  val default_catalog = "spark_catalog"
  val SUBQUERY_COLUMN_IDENTIFIER = "__subquery__"
  val AGGREGATE_COUNT_COLUMN_IDENTIFIER = "__count__"
  val LOCAL_TABLE_IDENTIFIER = "__local__"
  var hiveTableRelation = new ListBuffer[String]()
  type AttributeMap[A] = ListMap[Attribute, A]
  val listenerLineageInputTables = new HashSet[String]()
  var listenerLineageOutputTable:String = ""
  val listenerLineageLimitation = new ListBuffer[(String, String)]
  val conditionCache = new HashSet[String]()
  val joinAttribute: AttributeMap[AttributeSet] = ListMap[Attribute, AttributeSet]()
  var count = 0

  def parse(plan: LogicalPlan) = {
    try {
      val columnsLineage =
        extractColumnsLineage(plan, ListMap[Attribute, AttributeSet]()).toList.collect {
          case (k, attrs) =>
            k.name -> attrs.map(attr => (attr.qualifier :+ attr.name).mkString(".")).toSet
        }
      val (inputTables, outputTables) = columnsLineage.foldLeft((List[String](), List[String]())) {
        case ((inputs, outputs), (out, in)) =>
          val x = (inputs ++ in.map(_.split('.').init.mkString("."))).filter(_.nonEmpty)
          val y = outputs ++ List(out.split('.').init.mkString(".")).filter(_.nonEmpty)
          (x, y)
      }
      Lineage((inputTables++hiveTableRelation++listenerLineageInputTables.toList).distinct, outputTables.distinct, columnsLineage, listenerLineageLimitation.distinct.toList)
    } catch {
      case e:Exception => throw e
    }
  }

  def parseTableLineage(plan: LogicalPlan): Lineage = {
    extractTableLineage(plan)
    Lineage(listenerLineageInputTables.toList, List(listenerLineageOutputTable), List(), List())
  }

  private def extractTableLineage(plan: LogicalPlan): Unit = {
    plan match {
      case p if p.nodeName == "CreateTable" =>
        listenerLineageOutputTable = getV1TableName(getField[CatalogTable](plan, "tableDesc").qualifiedName).replace("spark_catalog.", "")
        p.children.foreach(extractTableLineage(_))

      case p if p.nodeName == "CreateDataSourceTableAsSelectCommand" =>
        listenerLineageOutputTable = getV1TableName(getField[CatalogTable](p, "table").qualifiedName).replace("spark_catalog.", "")
        p.children.foreach(extractTableLineage(_))

      case p if p.nodeName == "CreateHiveTableAsSelectCommand" =>
        listenerLineageOutputTable = getV1TableName(getField[CatalogTable](plan, "tableDesc").qualifiedName).replace("spark_catalog.", "")
        p.children.foreach(extractTableLineage(_))

      case p if p.nodeName == "InsertIntoStatement" =>
        listenerLineageOutputTable = getField[Identifier](p, "tableName").name
        p.children.foreach(extractTableLineage(_))

      case p if p.nodeName == "InsertIntoHadoopFsRelationCommand" =>
        val path = getField[Path](plan, "outputPath").toUri.toString
        val schema = parsePath(path)._1
        val table = parsePath(path)._2
        val log = s"InsertIntoHadoopFsRelationCommand path is $path, schema is $schema, table is $table"
        listenerLineageOutputTable = schema + "." + table
        p.children.foreach(extractTableLineage(_))

      case p if p.nodeName == "InsertIntoHiveTable" =>
        listenerLineageOutputTable = getV1TableName(getField[CatalogTable](plan, "table").qualifiedName)
        p.children.foreach(extractTableLineage(_))

      case p if p.nodeName == "WithCTE" =>
        if (null != p) {
          val optimized = sparkSession.sessionState.optimizer.execute(p)
          optimized.children.foreach(extractTableLineage(_))
        }

      case p if p.nodeName == "Project" =>
        for(i <- p.children.indices) {
          var subPlan = p.children.apply(i)
          var continue = true
          while (continue) {
            if (subPlan.isInstanceOf[Project]) {
              subPlan = subPlan.children.head
            } else continue = false
          }
          extractTableLineage(subPlan)
        }

      case p if p.nodeName == "Aggregate" =>
        p.children.foreach(extractTableLineage(_))

      case p if p.nodeName == "Window" =>
        p.children.foreach(extractTableLineage(_))

      case p: Join =>
        extractTableLineage(p.asInstanceOf[Join].left)
        extractTableLineage(p.asInstanceOf[Join].right)

      case p:Union =>
        p.children.foreach(extractTableLineage(_))

      case p:LogicalRelation =>
        var logicalRelation = p.asInstanceOf[LogicalRelation]
        if (logicalRelation.catalogTable.nonEmpty) {
          listenerLineageInputTables += getV1TableName(logicalRelation.catalogTable.get.qualifiedName)
        }

      case p: HiveTableRelation =>
        listenerLineageInputTables += getV1TableName(p.tableMeta.qualifiedName)

      case p: DataSourceV2ScanRelation =>
        listenerLineageInputTables += getV2TableName(p)

      case p: DataSourceV2Relation =>
        listenerLineageInputTables += getV2TableName(p)

      case p: Repartition =>
        p.children.foreach(extractTableLineage(_))

      case p =>
        if (p.childrenResolved)
          p.children.foreach(extractTableLineage(_))

      case _ => println(s"table lineage haven't sparse node $plan.nodeName")
    }
  }

  private def mergeColumnsLineage(
      left: AttributeMap[AttributeSet],
      right: AttributeMap[AttributeSet]): AttributeMap[AttributeSet] = {
    left ++ right.map {
      case (k, attrs) =>
        k -> (attrs ++ left.getOrElse(k, AttributeSet.empty))
    }
  }

  private def joinColumnsLineage(
      parent: AttributeMap[AttributeSet],
      child: AttributeMap[AttributeSet]): AttributeMap[AttributeSet] = {
    if (parent.isEmpty) child
    else {
      val childMap = child.map { case (k, attrs) => (k.exprId, attrs) }
      parent.map { case (k, attrs) =>
        k -> AttributeSet(attrs.flatMap(attr =>
          childMap.getOrElse(
            attr.exprId,
            if (attr.name.equalsIgnoreCase(AGGREGATE_COUNT_COLUMN_IDENTIFIER)) AttributeSet(attr)
            else AttributeSet.empty)))
      }
    }
  }

  private def getExpressionSubqueryPlans(expression: Expression): Seq[LogicalPlan] = {
    expression match {
      case s: ScalarSubquery => Seq(s.plan)
      case s => s.children.flatMap(getExpressionSubqueryPlans)
    }
  }

  private def findSparkPlanLogicalLink(sparkPlans: Seq[SparkPlan]): Option[LogicalPlan] = {
    sparkPlans.find(_.logicalLink.nonEmpty) match {
      case Some(sparkPlan) => sparkPlan.logicalLink
      case None => findSparkPlanLogicalLink(sparkPlans.flatMap(_.children))
    }
  }

  private def containsCountAll(expr: Expression): Boolean = {
    expr match {
      case e: Count if e.references.isEmpty => true
      case e =>
        e.children.exists(containsCountAll)
    }
  }

  private def getSelectColumnLineage(
      named: Seq[NamedExpression]): AttributeMap[AttributeSet] = {
    val exps = named.map {
      case exp: Alias =>
        val references =
          if (exp.references.nonEmpty) exp.references
          else {
            val attrRefs = getExpressionSubqueryPlans(exp.child)
              .map(extractColumnsLineage(_, ListMap[Attribute, AttributeSet]()))
              .foldLeft(ListMap[Attribute, AttributeSet]())(mergeColumnsLineage).values
              .foldLeft(AttributeSet.empty)(_ ++ _)
              .map(attr => attr.withQualifier(attr.qualifier :+ SUBQUERY_COLUMN_IDENTIFIER))
            AttributeSet(attrRefs)
          }
        (
          exp.toAttribute,
          if (!containsCountAll(exp.child)) references
          else references + exp.toAttribute.withName(AGGREGATE_COUNT_COLUMN_IDENTIFIER))
      case a: Attribute => a -> AttributeSet(a)
    }
    ListMap(exps: _*)
  }

  private def joinRelationColumnLineage(
      parent: AttributeMap[AttributeSet],
      relationAttrs: Seq[Attribute],
      qualifier: Seq[String]): AttributeMap[AttributeSet] = {
    val relationAttrSet = AttributeSet(relationAttrs)
    if (parent.nonEmpty) {
      parent.map { case (k, attrs) =>
        k -> AttributeSet(attrs.collect {
          case attr if relationAttrSet.contains(attr) =>
            attr.withQualifier(qualifier)
          case attr
              if attr.qualifier.nonEmpty && attr.qualifier.last.equalsIgnoreCase(
                SUBQUERY_COLUMN_IDENTIFIER) =>
            attr.withQualifier(attr.qualifier.init)
          case attr if attr.name.equalsIgnoreCase(AGGREGATE_COUNT_COLUMN_IDENTIFIER) =>
            attr.withQualifier(qualifier)
          case attr if isNameWithQualifier(attr, qualifier) =>
            val newName = attr.name.split('.').last.stripPrefix("`").stripSuffix("`")
            attr.withName(newName).withQualifier(qualifier)
        })
      }
    } else {
      ListMap(relationAttrs.map { attr =>
        (
          attr,
          AttributeSet(attr.withQualifier(qualifier)))
      }: _*)
    }
  }

  private def isNameWithQualifier(attr: Attribute, qualifier: Seq[String]): Boolean = {
    val nameTokens = attr.name.split('.')
    val namespace = nameTokens.init.mkString(".")
    nameTokens.length > 1 && namespace.endsWith(qualifier.mkString("."))
  }

  private def mergeRelationColumnLineage(
      parentColumnsLineage: AttributeMap[AttributeSet],
      relationOutput: Seq[Attribute],
      relationColumnLineage: AttributeMap[AttributeSet]): AttributeMap[AttributeSet] = {
    val mergedRelationColumnLineage = {
      relationOutput.foldLeft((ListMap[Attribute, AttributeSet](), relationColumnLineage)) {
        case ((acc, x), attr) =>
          (acc + (attr -> x.head._2), x.tail)
      }._1
    }
    joinColumnsLineage(parentColumnsLineage, mergedRelationColumnLineage)
  }

  private def extractColumnsLineage(
      plan: LogicalPlan,
      parentColumnsLineage: AttributeMap[AttributeSet]): AttributeMap[AttributeSet] = {
    count = count + 1
    if (count >= 100000) {
      throw new Exception(" parser column lineage failed, dead loop ")
    }
    plan match {
      case p if p.nodeName == "CommandResult" =>
        val commandPlan = getField[LogicalPlan](plan, "commandLogicalPlan")
        extractColumnsLineage(commandPlan, parentColumnsLineage)
      case p if p.nodeName == "AlterViewAsCommand" =>
        val query =
          if (SPARK_RUNTIME_VERSION <= "3.1") {
            sparkSession.sessionState.analyzer.execute(getQuery(plan))
          } else {
            getQuery(plan)
          }
        val view = getV1TableName(getField[TableIdentifier](plan, "name").unquotedString)
        extractColumnsLineage(query, parentColumnsLineage).map { case (k, v) =>
          k.withName(s"$view.${k.name}") -> v
        }

      case p
          if p.nodeName == "CreateViewCommand"
            && getField[ViewType](plan, "viewType") == PersistedView =>
        val view = getV1TableName(getField[TableIdentifier](plan, "name").unquotedString)
        val outputCols =
          getField[Seq[(String, Option[String])]](plan, "userSpecifiedColumns").map(_._1)
        val query =
          if (SPARK_RUNTIME_VERSION <= "3.1") {
            sparkSession.sessionState.analyzer.execute(getField[LogicalPlan](plan, "child"))
          } else {
            getField[LogicalPlan](plan, "plan")
          }

        val lineages = extractColumnsLineage(query, parentColumnsLineage).zipWithIndex.map {
          case ((k, v), i) if outputCols.nonEmpty => k.withName(s"$view.${outputCols(i)}") -> v
          case ((k, v), _) => k.withName(s"$view.${k.name}") -> v
        }.toSeq
        ListMap[Attribute, AttributeSet](lineages: _*)

      case p if p.nodeName == "CreateDataSourceTableAsSelectCommand" =>
        val table = getV1TableName(getField[CatalogTable](plan, "table").qualifiedName)
        extractColumnsLineage(getQuery(plan), parentColumnsLineage).map { case (k, v) =>
          k.withName(s"$table.${k.name}") -> v
        }

      case p
          if p.nodeName == "CreateHiveTableAsSelectCommand" ||
            p.nodeName == "OptimizedCreateHiveTableAsSelectCommand" =>
        val table = getV1TableName(getField[CatalogTable](plan, "tableDesc").qualifiedName)
        extractColumnsLineage(getQuery(plan), parentColumnsLineage).map { case (k, v) =>
          k.withName(s"$table.${k.name}") -> v
        }

      case p
          if p.nodeName == "CreateTableAsSelect" ||
            p.nodeName == "ReplaceTableAsSelect" =>
        val (table, namespace, catalog) =
          if (SPARK_RUNTIME_VERSION <= "3.2") {
            (
              getField[Identifier](plan, "tableName").name,
              getField[Identifier](plan, "tableName").namespace.mkString("."),
              getField[TableCatalog](plan, "catalog").name())
          } else {
            (
              invokeAs[Identifier](plan, "tableName").name(),
              invokeAs[Identifier](plan, "tableName").namespace().mkString("."),
              getField[CatalogPlugin](
                invokeAs[LogicalPlan](plan, "name"),
                "catalog").name())
          }
        extractColumnsLineage(getQuery(plan), parentColumnsLineage).map { case (k, v) =>
          k.withName(Seq(catalog, namespace, table, k.name).filter(_.nonEmpty).mkString(".")) -> v
        }

      case p if p.nodeName == "InsertIntoDataSourceCommand" =>
        val logicalRelation = getField[LogicalRelation](plan, "logicalRelation")
        val table = logicalRelation
          .catalogTable.map(t => getV1TableName(t.qualifiedName)).getOrElse("")
        extractColumnsLineage(getQuery(plan), parentColumnsLineage).map {
          case (k, v) if table.nonEmpty =>
            k.withName(s"$table.${k.name}") -> v
        }

      case p if p.nodeName == "InsertIntoHadoopFsRelationCommand" =>
        var table =
          getField[Option[CatalogTable]](plan, "catalogTable")
            .map(t => getV1TableName(t.qualifiedName))
            .getOrElse("")

        if (table.isEmpty) {
          val path = getField[Path](plan, "outputPath").toUri.toString
          val schema = parsePath(path)._1
          val tab = parsePath(path)._2
          table = schema + "." + tab
        }
        extractColumnsLineage(getQuery(plan), parentColumnsLineage).map {
          case (k, v) if table.nonEmpty =>
            k.withName(s"$table.${k.name}") -> v
          case (k, v) if table.isEmpty =>
            k.withName(k.name) -> v
        }

      case p
          if p.nodeName == "InsertIntoDataSourceDirCommand" ||
            p.nodeName == "InsertIntoHiveDirCommand" =>
        val dir =
          getField[CatalogStorageFormat](plan, "storage").locationUri.map(_.toString)
            .getOrElse("")
        extractColumnsLineage(getQuery(plan), parentColumnsLineage).map {
          case (k, v) if dir.nonEmpty =>
            k.withName(s"`$dir`.${k.name}") -> v
        }

      case p if p.nodeName == "InsertIntoHiveTable" =>
        val table = getV1TableName(getField[CatalogTable](plan, "table").qualifiedName)
        extractColumnsLineage(getQuery(plan), parentColumnsLineage).map { case (k, v) =>
          k.withName(s"$table.${k.name}") -> v
        }

      case p if p.nodeName == "SaveIntoDataSourceCommand" =>
        extractColumnsLineage(getQuery(plan), parentColumnsLineage)

      case p
          if p.nodeName == "AppendData"
            || p.nodeName == "OverwriteByExpression"
            || p.nodeName == "OverwritePartitionsDynamic" =>
        val table = getV2TableName(getField[NamedRelation](plan, "table"))
        extractColumnsLineage(getQuery(plan), parentColumnsLineage).map { case (k, v) =>
          k.withName(s"$table.${k.name}") -> v
        }

      case p if p.nodeName == "MergeIntoTable" =>
        val matchedActions = getField[Seq[MergeAction]](plan, "matchedActions")
        val notMatchedActions = getField[Seq[MergeAction]](plan, "notMatchedActions")
        val allAssignments = (matchedActions ++ notMatchedActions).collect {
          case UpdateAction(_, assignments) => assignments
          case InsertAction(_, assignments) => assignments
        }.flatten
        val nextColumnsLlineage = ListMap(allAssignments.map { assignment =>
          (
            assignment.key.asInstanceOf[Attribute],
            assignment.value.references)
        }: _*)
        val targetTable = getField[LogicalPlan](plan, "targetTable")
        val sourceTable = getField[LogicalPlan](plan, "sourceTable")
        val targetColumnsLineage = extractColumnsLineage(
          targetTable,
          nextColumnsLlineage.map { case (k, _) => (k, AttributeSet(k)) })
        val sourceColumnsLineage = extractColumnsLineage(sourceTable, nextColumnsLlineage)
        val targetColumnsWithTargetTable = targetColumnsLineage.values.flatten.map { column =>
          val unquotedQualifiedName = (column.qualifier :+ column.name).mkString(".")
          column.withName(unquotedQualifiedName)
        }
        ListMap(targetColumnsWithTargetTable.zip(sourceColumnsLineage.values).toSeq: _*)

      case p if p.nodeName == "WithCTE" =>
        p.children.map(extractColumnsLineage(_, parentColumnsLineage)).reduce(mergeColumnsLineage)

      case p: Project =>
        p.children.map(extractColumnsLineage(_, joinColumnsLineage(parentColumnsLineage, getSelectColumnLineage(p.projectList)))).reduce(mergeColumnsLineage)

      case p: Aggregate =>
        p.children.map(extractColumnsLineage(_, joinColumnsLineage(parentColumnsLineage, getSelectColumnLineage(p.aggregateExpressions)))).reduce(mergeColumnsLineage)

      case p: Expand =>
        p.children.map(extractColumnsLineage(_, joinColumnsLineage(parentColumnsLineage, ListMap(p.output.zip(p.projections.transpose.map(_.flatMap(x => x.references)).map(AttributeSet(_))): _*)))).reduce(mergeColumnsLineage)

      case p: Generate =>
        val generateColumnsLineageWithId =
          ListMap(p.generatorOutput.map(attrRef => (attrRef.toAttribute.exprId, p.references)): _*)

        val nextColumnsLineage = parentColumnsLineage.map {
          case (key, attrRefs) =>
            key -> AttributeSet(attrRefs.flatMap(attr =>
              generateColumnsLineageWithId.getOrElse(
                attr.exprId,
                AttributeSet(attr))))
        }
        p.generator match {
          case o: Explode => {
            o.references.foreach {
              case x:AttributeReference => {
                AttributeLineage.findSourceAttributes(x, p.child).foreach(y => {
                  listenerLineageLimitation.append((y, o.toString()))
                })
              }
            }
          }
        }

        p.children.map(extractColumnsLineage(_, nextColumnsLineage)).reduce(mergeColumnsLineage)

      case p: Window =>
        val windowColumnsLineage =
          ListMap(p.windowExpressions.map(exp => (exp.toAttribute, exp.references)): _*)

        val nextColumnsLineage = if (parentColumnsLineage.isEmpty) {
          ListMap(p.child.output.map(attr => (attr, attr.references)): _*) ++ windowColumnsLineage
        } else {
          parentColumnsLineage.map {
            case (k, _) if windowColumnsLineage.contains(k) =>
              k -> windowColumnsLineage(k)
            case (k, attrs) =>
              k -> AttributeSet(attrs.flatten(attr =>
                windowColumnsLineage.getOrElse(attr, AttributeSet(attr))))
          }
        }

        val wind = p.asInstanceOf[Window]
        wind.partitionSpec.filter(o => o.isInstanceOf[AttributeReference]).foreach(x => AttributeLineage.findSourceAttributes(x.asInstanceOf[AttributeReference], p.child).foreach(y => {
          listenerLineageLimitation.append((y, p.windowExpressions.toString()))
        }))
        wind.orderSpec.foreach(o => {
          if (o.child.isInstanceOf[AttributeReference]) {
            AttributeLineage.findSourceAttributes(o.child.asInstanceOf[AttributeReference], p.child).foreach(y => listenerLineageLimitation.append((y, o.toString())))
          }
        })
        p.children.map(extractColumnsLineage(_, nextColumnsLineage)).reduce(mergeColumnsLineage)

      case p: Join =>
        try {
          val jt = p.joinType.toString
          val expr = p.condition.head.toString
          p.condition.map(_.references).getOrElse(AttributeSet.empty).foreach {
            x => AttributeLineage.findSourceAttributes(x.asInstanceOf[AttributeReference], p).foreach(y => {
              listenerLineageLimitation.append((y, jt + " " + expr))
            })
          }
        } catch {
          case e:Exception =>
        }

        p.children.map(extractColumnsLineage(_, parentColumnsLineage)).reduce(mergeColumnsLineage)

      case p: Union =>
        val childrenColumnsLineage =
          if (p.output.isEmpty) {
            p.children
              .map(extractColumnsLineage(_, ListMap[Attribute, AttributeSet]()))
              .reduce(mergeColumnsLineage)
          } else {
            val childrenUnion =
              p.children.map(extractColumnsLineage(_, ListMap[Attribute, AttributeSet]())).map(
                _.values).reduce {
                (left, right) =>
                  left.zip(right).map(attr => attr._1 ++ attr._2)
              }
            ListMap(p.output.zip(childrenUnion): _*)
          }
        joinColumnsLineage(parentColumnsLineage, childrenColumnsLineage)

      case p: LogicalRelation if p.catalogTable.nonEmpty =>
        val tableName = getV1TableName(p.catalogTable.get.qualifiedName)
        hiveTableRelation+=tableName
        joinRelationColumnLineage(parentColumnsLineage, p.output, Seq(tableName))

      case p: HiveTableRelation =>
        val tableName = getV1TableName(p.tableMeta.qualifiedName)
        hiveTableRelation+=tableName
        joinRelationColumnLineage(parentColumnsLineage, p.output, Seq(tableName))

      case p: DataSourceV2ScanRelation =>
        val tableName = getV2TableName(p)
        joinRelationColumnLineage(parentColumnsLineage, p.output, Seq(tableName))

      case p: DataSourceV2Relation =>
        val tableName = getV2TableName(p)
        joinRelationColumnLineage(parentColumnsLineage, p.output, Seq(tableName))

      case p: LocalRelation =>
        joinRelationColumnLineage(parentColumnsLineage, p.output, Seq(LOCAL_TABLE_IDENTIFIER))

      case _: OneRowRelation =>
        parentColumnsLineage.map {
          case (k, attrs) =>
            k -> AttributeSet(attrs.map {
              case attr
                  if attr.qualifier.nonEmpty && attr.qualifier.last.equalsIgnoreCase(
                    SUBQUERY_COLUMN_IDENTIFIER) =>
                attr.withQualifier(attr.qualifier.init)
              case attr => attr
            })
        }

      case p: View =>
        if (!p.isTempView) {
          val viewName = getV1TableName(p.desc.qualifiedName)
          joinRelationColumnLineage(parentColumnsLineage, p.output, Seq(viewName))
        } else {
          val viewColumnsLineage =
            extractColumnsLineage(p.child, ListMap[Attribute, AttributeSet]())
          mergeRelationColumnLineage(parentColumnsLineage, p.output, viewColumnsLineage)
        }

      case p: InMemoryRelation =>
        // get logical plan from cachedPlan
        val cachedTableLogical = findSparkPlanLogicalLink(Seq(p.cacheBuilder.cachedPlan))
        cachedTableLogical match {
          case Some(logicPlan) =>
            val relationColumnLineage =
              extractColumnsLineage(logicPlan, ListMap[Attribute, AttributeSet]())
            mergeRelationColumnLineage(parentColumnsLineage, p.output, relationColumnLineage)
          case _ =>
            joinRelationColumnLineage(
              parentColumnsLineage,
              p.output,
              p.cacheBuilder.tableName.toSeq)
        }

      case p:Filter => {
        p.condition.map(_.references).foreach {
          x => {
            x.foreach(y => {
              AttributeLineage.findSourceAttributes(y.asInstanceOf[AttributeReference], p.child).foreach(y => {
                listenerLineageLimitation.append((y, p.condition.toString()))
              })
            })
          }
        }
        p.children.map(extractColumnsLineage(_, parentColumnsLineage)).reduce(mergeColumnsLineage)
      }

      case p if p.children.isEmpty => {
        ListMap[Attribute, AttributeSet]()
      }

      case p =>
        p.children.map(extractColumnsLineage(_, parentColumnsLineage)).reduce(mergeColumnsLineage)
    }
  }

  private def extractCondition(exp: Expression, limit:Iterable[Attribute], plan:LogicalPlan): Unit = {
    if (count >= 100000) {
      throw new Exception(" parser column lineage failed, dead loop ")
    }
    exp match {
      case attr: AttributeReference => unwrap(attr, limit, exp.toString())
      case and:And => {
        extractCondition(and.left, limit, plan)
        extractCondition(and.right, limit, plan)
      }
      case not:Not => binaryExpression(not.child, limit, "NOT", plan)
      case inSubquery: InSubquery => {
        inSubquery.references.foreach(a => unwrap(a, limit, inSubquery.toString()))
        val qp = extractColumnsLineage(inSubquery.query.plan, ListMap[Attribute, AttributeSet]()).values.flatten
        qp.foreach(o => listenerLineageLimitation :+ ((o.qualifier.mkString(".") + "." + o.name), qp.toString()))
      }
      case exists: Exists => {
        exists.outerAttrs.foreach(a => unwrap(a, limit, exists.toString()))
        exists.plan.children.foreach(o => extractColumnsLineage(o, ListMap[Attribute, AttributeSet]()))
      }
      case attr: ScalarSubquery => attr.plan.children.foreach(o => extractColumnsLineage(o, ListMap[Attribute, AttributeSet]()))
      case binaryOperator:BinaryOperator => binaryExpression(binaryOperator, limit, "", plan)
      case binaryComparison:BinaryComparison => binaryExpression(binaryComparison, limit, "", plan)
      case predicate:Predicate => binaryExpression(predicate, limit, "", plan)
      case stringRegexExpression:StringRegexExpression => binaryExpression(stringRegexExpression, limit, "", plan)
      case _ =>
    }
  }

  private def unwrap(expr: Expression, limit:Iterable[Attribute], usage:String):Unit = {
    expr match {
      case attr:AttributeReference => extractAttribute(limit.find(_.semanticEquals(attr)), usage)
      case cast:Cast => cast.child.foreach {
        case attr:AttributeReference => extractAttribute(limit.find(_.semanticEquals(attr)), usage)
        case scalarSubquery: ScalarSubquery => extractCondition(scalarSubquery, limit, scalarSubquery.plan)
        case _ =>
      }
      case ternaryExpression: TernaryExpression => ternaryExpression.references.foreach(ref => extractAttribute(limit.find(_.semanticEquals(ref)), usage))
      case unaryExpression: UnaryExpression => unaryExpression.references.foreach(ref => extractAttribute(limit.find(_.semanticEquals(ref)), usage))
      case binaryExpression:BinaryExpression => binaryExpression.references.foreach(ref => extractAttribute(limit.find(_.semanticEquals(ref)), usage))
      case _=>
    }
  }

  private def format(not:String, express:String):String = {
    (not + " " + express).trim
  }

  private def binaryExpression(expr: Expression, limit:Iterable[Attribute], not:String, plan:LogicalPlan): Unit = {
    expr match {
      case bc:BinaryComparison =>
        unwrap(bc.left, limit, format(not, bc.toString()))
        unwrap(bc.right, limit, format(not, bc.toString()))
      case in:In => unwrap(in.value, limit, format(not, in.toString()))
      case stringRegexExpression:StringRegexExpression => {
        unwrap(stringRegexExpression.left, limit, format(not, stringRegexExpression.toString()))
        unwrap(stringRegexExpression.right, limit, format(not, stringRegexExpression.toString()))
      }
      case _ =>
    }
  }

  private def extractAttribute(matchedOpt: Option[Attribute], usage:String) = {
    matchedOpt match {
      case Some(attribute) => listenerLineageLimitation.append((attribute.qualifier.mkString(".") + "." + attribute.name, usage))
      case None =>
    }
  }

  //hardcode for shopee
  private def parsePath(path: String): (String, String) = {
    if (path.contains(".db")) {
      val cleanedPath = path.stripPrefix("hdfs://").stripPrefix("/")
      val pathParts = cleanedPath.split("/")
      val dbPart = pathParts.find(_.endsWith(".db")).getOrElse("")
      val dbName = dbPart.stripSuffix(".db")
      val table = pathParts.dropWhile(_ != dbPart).drop(1).headOption.getOrElse("")
      return (dbName, table)
    } else if (path.contains("/hive/")) {
      val hiveIndex = path.lastIndexOf("/hive")
      if (hiveIndex != -1) {
        val subPath = path.substring(hiveIndex + "/hive".length)
        val parts = subPath.split("/")
        if (parts.length >= 3) {
          return (parts(1), parts(2))
        }
        throw new Exception("unknown hdfs url " + path)
      }
    }
    throw new Exception("unknown hdfs url " + path)
  }

  private def getQuery(plan: LogicalPlan): LogicalPlan = getField[LogicalPlan](plan, "query")

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

  private def getV1TableName(qualifiedName: String): String = {
    qualifiedName.split("\\.") match {
      case Array(database, table) =>
        Seq(default_catalog, database, table).filter(_.nonEmpty).mkString(".")
      case _ => qualifiedName
    }
  }
}

case class SparkSQLLineageParseHelper(sparkSession: SparkSession) extends LineageParser
  with Logging {
  def transformToLineage(
      executionId: Long,
      plan: LogicalPlan): Lineage = {
//    logInfo(plan.toJSON)
//    Try(parse(plan)).recover {
//      case e: Exception =>
//        logWarning(s"Extract Statement[$executionId] columns lineage failed.", e)
//        throw e
//    }.toOption
    parse(plan)
  }

  def transformToTableLineage(executionId: Long, plan: LogicalPlan): Lineage = {
//    Try(parseTableLineage(plan)).recover {
//      case e: Exception =>
//        e.printStackTrace()
//        logWarning(s"Extract Statement[$executionId] columns lineage failed.", e)
//        throw e
//    }.toOption
    parseTableLineage(plan)
  }

  def clearCache():Unit = {
    try {
      this.listenerLineageLimitation.clear()
      this.conditionCache.clear()
    } catch {
      case exp:Throwable =>
    }
  }
}

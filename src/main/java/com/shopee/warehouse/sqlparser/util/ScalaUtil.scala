package com.shopee.warehouse.sqlparser.util

import com.shopee.warehouse.sqlparser.Lineage
import com.shopee.warehouse.sqlparser.pojo.entity.Limitation

import scala.collection.JavaConverters._
object ScalaUtil {
  def convertScalaListToJavaList(sList: List[String]) : java.util.List[String] = {
    sList.asJava
  }

  def convertScalaSetToJavaList(sList: Set[String]) : java.util.List[String] = {
    sList.toList.asJava
  }

  def getLimitationAsJava(limitation:Lineage): java.util.List[Limitation] = {
    limitation.limitation.map { case (columnName, limitExpr) =>
      val l = new Limitation()
      l.setColumnName(columnName)
      l.setLimitExpr(limitExpr)
      l
    }.asJava
  }
}

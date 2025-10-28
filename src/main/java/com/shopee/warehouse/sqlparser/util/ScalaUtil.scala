package com.shopee.warehouse.sqlparser.util

import scala.collection.JavaConverters._
object ScalaUtil {
  def convertScalaListToJavaList(sList: List[String]) : java.util.List[String] = {
    sList.asJava
  }

  def convertScalaSetToJavaList(sList: Set[String]) : java.util.List[String] = {
    sList.toList.asJava
  }
}

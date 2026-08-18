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

package com.shopee.warehouse.sqlparser

import com.shopee.warehouse.sqlparser.pojo.entity.Limitation
import java.util

case class ColumnLineage(column: String, originalColumns: Set[String]) {
  override def toString: String = {
    val originals = originalColumns.mkString(", ")
    s"$column -> [$originals]"
  }
}

/**
 * @param inputTables the tables of the operation will read
 * @param outputTables the tables of the operation will write
 * @param columnLineage the output columns are associated to columns of the real table's columns
 */

class Lineage(
    val inputTables: List[String],
    val outputTables: List[String],
    val columnLineage: List[ColumnLineage],
    val limitation: List[(String, String)]
    ) {

  override def equals(other: Any): Boolean = other match {
    case otherLineage: Lineage =>
      otherLineage.inputTables.toSet == inputTables.toSet &&
      otherLineage.outputTables.toSet == outputTables.toSet &&
      otherLineage.columnLineage.toSet == columnLineage.toSet
    case _ => false
  }

  override def hashCode(): Int = super.hashCode()

//  override def toString: String = {
//    s"inputTables($inputTables)\n" +
//      s"outputTables($outputTables)\n" +
//      s"columnLineage($columnLineage)\n " +
//      s"limitation($limitation)"
//  }
//
  override def toString: String = {
    val inputs = inputTables.mkString("  - ", "\n  - ", "")
    val outputs = outputTables.mkString("  - ", "\n  - ", "")
    val columns = columnLineage.mkString("  - ", "\n  - ", "")
    val limits = limitation.map { case (k, v) => s"  - $k -> $v" }.mkString("\n")

  s"""Lineage {
  Input Tables:
$inputs
  Output Tables:
$outputs
  Column Lineage:
$columns
  Limitation:
$limits
}"""
  }

  def isEmpty: Boolean = {
    if (inputTables.isEmpty || outputTables.isEmpty) return true
     outputTables.exists(o => o.equalsIgnoreCase("__local__")) && inputTables.exists(o => o.equalsIgnoreCase("__local__"))
  }
}

object Lineage {
  def apply(
             inputTables: List[String],
             outputTables: List[String],
             columnLineage: List[(String, Set[String])],
             limitation: List[(String, String)]
           ): Lineage = {
    val newColumnLineage = columnLineage.map {
      case (column, originalColumns) =>
        ColumnLineage(column, originalColumns)
    }
    new Lineage(inputTables, outputTables, newColumnLineage, limitation)
  }
}

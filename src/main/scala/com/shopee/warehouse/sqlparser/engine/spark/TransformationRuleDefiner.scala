package com.shopee.warehouse.sqlparser.engine.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.analysis.Analyzer
import org.apache.spark.sql.catalyst.catalog.SessionCatalog
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan
import org.apache.spark.sql.catalyst.rules.Rule

case class TransformationRuleDefiner() extends Rule[LogicalPlan]{
  override def apply(plan: LogicalPlan): LogicalPlan = {
    plan
  }
}

class CustomAnalyzer(catalog: SessionCatalog) extends Analyzer(catalog) {
  override val batches: Seq[Batch] = Seq(
    Batch("Disable Transformation", Once, TransformationRuleDefiner())
  ) ++ super.batches

  def init(session: SparkSession) : SparkSession = {
    var catalog = session.sessionState.catalog
//    session.sessionState.analyzer = new CustomAnalyzer(catalog);
    session
  }
}

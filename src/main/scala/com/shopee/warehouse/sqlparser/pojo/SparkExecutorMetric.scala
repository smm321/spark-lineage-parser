package com.shopee.warehouse.sqlparser.pojo

import scala.collection.mutable

class SparkExecutorMetric {
  private var yarnApplicationId:String = null

  private var yarnApplicationName:String = null

  private var startTime:Long = 0

  private var endTime:Long = 0

  private var allRule:java.util.HashMap[String, String] = null

  private var jobConf:java.util.HashMap[String, String] = null

  private var preRule:java.util.List[String] = null

  private var optRule:java.util.Set[String] = null

  private var sql:String = null

  def setJobConf(conf: java.util.HashMap[String, String]): Unit = {
    this.jobConf = conf
  }

  def getJobConf: java.util.HashMap[String, String] = {
    this.jobConf
  }

  def setAllRule(rule: java.util.HashMap[String, String]): Unit = {
    this.allRule = rule
  }

  def setPreRule(preRule:java.util.List[String]): Unit = {
    this.preRule = preRule
  }

  def setOptRule(optRule:java.util.Set[String]): Unit = {
    this.optRule = optRule
  }

  def setSql(sql:String): Unit = {
    this.sql = sql
  }

  def getYarnApplicationId: String = yarnApplicationId

  def setYarnApplicationId(yarnApplicationId: String): Unit = {
    this.yarnApplicationId = yarnApplicationId
  }

  def getMetrics: mutable.HashMap[(String, String), Long] = metrics

  def setMetrics(metrics: mutable.HashMap[(String, String), Long]): Unit = {
    this.metrics = metrics
  }

  private var metrics:mutable.HashMap[(String, String), Long] = null

  def setStartTime(startTime:Long):Unit = {
    this.startTime = startTime
  }

  def setEndTime(endTime:Long):Unit = {
    this.endTime = endTime
  }

  def setYarnApplicationName(name: String): Unit = {
    this.yarnApplicationName = name
  }

  def getYarnApplicationName(): String = {
    this.yarnApplicationName
  }

  def getStartTime():Long = startTime

  def getEndTime():Long = endTime

  private var errMsg:mutable.HashMap[(String, String), String] = null

  def setErrMsg(errMsg: mutable.HashMap[(String, String), String]):Unit = {
    this.errMsg = errMsg
  }

  def getSql(): String = {
    this.sql
  }

  def getAllRule(): java.util.HashMap[String, String] = {
    this.allRule
  }

  def getPreRule(): java.util.List[String] = {
    this.preRule
  }

  def getOptRule(): java.util.Set[String] = {
    this.optRule
  }
}

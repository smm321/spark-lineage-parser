package com.shopee.warehouse.sqlparser

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.google.gson.{Gson, GsonBuilder}
import com.shopee.warehouse.sqlparser.engine.spark.helper.SparkSQLLineageParseHelper
import com.shopee.warehouse.sqlparser.pojo.entity.Limitation
import com.shopee.warehouse.sqlparser.pojo.{ColumnLineageResult, LineageResult, SparkExecutorMetric, SparkStageMetric}
import com.shopee.warehouse.sqlparser.util.ScalaUtil
import org.apache.kyuubi.util.reflect.ReflectUtils.getField
import org.apache.spark.scheduler._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.rules.Rule
import org.apache.spark.sql.execution.{QueryExecution, SparkPlan}
import org.apache.spark.sql.execution.ui.SparkListenerSQLExecutionEnd
import org.apache.spark.sql.util.QueryExecutionListener

import java.io.{BufferedWriter, OutputStreamWriter}
import java.net.{HttpURLConnection, InetSocketAddress, URL}
import scala.collection.JavaConverters._
import scala.collection.mutable

class SparkQueryExecutionListener extends QueryExecutionListener{
  val seatalkMsg = new java.util.HashSet[String]
  var appId: String = ""
  override def onSuccess(funcName: String, qe: QueryExecution, durationNs: Long): Unit = {
    try{
      appId = qe.sparkSession.sparkContext.getConf.get("spark.app.id")
      var lineageOpt:Lineage = null
      try {
        lineageOpt = SparkSQLLineageParseHelper.apply(qe.sparkSession).transformToLineage(0, qe.logical)
      } catch {
        case e:Exception => {
          lineageOpt = SparkSQLLineageParseHelper.apply(qe.sparkSession).transformToTableLineage(0, qe.logical)
        }
      }

      if (lineageOpt.isEmpty) return
      val lineage = lineageOpt
      if (lineage.inputTables.isEmpty || lineage.outputTables.isEmpty) return
      if (lineage.outputTables.exists(o => o.equalsIgnoreCase("__local__"))
        || lineage.inputTables.exists(o => o.equalsIgnoreCase("__local__"))) return

      if ((lineage.outputTables.isEmpty || lineage.outputTables.headOption.contains("")) && lineage.inputTables.headOption.nonEmpty) {
        lineageOpt = SparkSQLLineageParseHelper.apply(qe.sparkSession).transformToTableLineage(0, qe.logical)
      }
//      println(lineage.toString)
      val bankLineage:LineageResult = new LineageResult
      bankLineage.setInputTable(ScalaUtil.convertScalaListToJavaList(lineage.inputTables))
      if (lineage.outputTables.isEmpty) return
      bankLineage.setOutputTable(lineage.outputTables.head)
      val list = new java.util.ArrayList[ColumnLineageResult]
      lineage.columnLineage.foreach(o => {
        val r:ColumnLineageResult = new ColumnLineageResult
        r.setColumnName(o.column)
        r.setOriginal(o.originalColumns.toList.asJava)
        list.add(r)
      })
      bankLineage.setColumnLineages(list)
      val limitList = new java.util.ArrayList[Limitation]()
      lineage.limitation.foreach(o => {
        val limitation = new Limitation()
        limitation.setColumnName(o._1)
        limitation.setLimitExpr(o._2)
        limitList.add(limitation)
      })
      bankLineage.setLimitations(limitList)
      bankLineage.setPath(appId)
      notifyLineageResultToSqlParser(bankLineage, qe.sparkSession.sparkContext.getConf.get("spark.sql.parser.host"),
        qe.sparkSession.sparkContext.getConf.get("spark.sql.parser.port"))
      SparkSQLLineageParseHelper.apply(qe.sparkSession).clearCache()
    } catch {
      case exception: Exception =>
          exception.printStackTrace()
//        parseResultNotify(exception.getMessage, qe.sparkSession.sparkContext.getConf.get("spark.sql.parser.host"))
    }
  }

  override def onFailure(funcName: String, qe: QueryExecution, exception: Exception): Unit = {
  }

  def notifyLineageResultToSqlParser(result: LineageResult, host: String, port: String): Unit = {
    try{
      val gson = new GsonBuilder()
        .disableHtmlEscaping()
        .create()
      val req:String = gson.toJson(result)
      if (null != appId && appId.startsWith("local")) println(req)

      val url = new URL(String.format("http://%s:%s/listenerLineage", host, port))
      val connection: HttpURLConnection = url.openConnection().asInstanceOf[HttpURLConnection]
      connection.setRequestMethod("POST")
      connection.setRequestProperty("Content-Type", "application/json")
      connection.setDoOutput(true)
      connection.setConnectTimeout(10000)
      connection.setReadTimeout(10000)
      val outputStream = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream, "UTF-8"))
      outputStream.write(req)
      outputStream.flush()
      outputStream.close()
      val responseCode = connection.getResponseCode
//      if (200 != responseCode) {
//        println(s"table lineage Request : $req")
//        println(s"table lineage Response Code: $responseCode")
//      }
      connection.disconnect()
    } catch {
      case _: Exception => println("table lineage Response failed")
    }
  }

//  def parseResultNotify(msg:String, host:String): Unit = {
//    try {
//      val (ctalkUrl, squid) = getNotifyInfo(host)
//      val url = new URL(ctalkUrl)
//      val proxy = new java.net.Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(squid, 3128))
//      val connection: HttpURLConnection = url.openConnection(proxy).asInstanceOf[HttpURLConnection]
//      connection.setRequestMethod("POST")
//      connection.setRequestProperty("Content-Type", "application/json")
//      connection.setDoOutput(true)
//      connection.setConnectTimeout(10000)
//      connection.setReadTimeout(10000)
//      val outputStream = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream, "UTF-8"))
//      val ctalkRequest = new java.util.HashMap[String, Object]()
//      val content = new java.util.HashMap[String, String]()
//      content.put("content", msg)
//      ctalkRequest.put("tag", "text")
//      ctalkRequest.put("text", content)
//      val mapper = new ObjectMapper()
//      mapper.registerModule(DefaultScalaModule)
//      val req = mapper.writeValueAsString(ctalkRequest)
//      if (seatalkMsg.contains(req)) return
//      seatalkMsg.add(req)
//      println(s"ctalk Request : $req")
//      outputStream.write(req)
//      outputStream.flush()
//      outputStream.close()
//      val responseCode = connection.getResponseCode
//      println(s"ctalk Response Code: $responseCode")
//      connection.disconnect()
//    } catch {
//      case _: Exception =>
//    }
//  }

//  def getNotifyInfo(host:String): (String, String) = {
//    host match {
//      case "10.213.3.63" => ("https://openapi.seatalk.io/webhook/group/5D8nePbpS8-8bJe8ymClVg", "id-squid-nonlive.mdw.seabanksvc.com")
//      case "10.213.3.64" => ("https://openapi.seatalk.io/webhook/group/5D8nePbpS8-8bJe8ymClVg", "ph-squid-nonlive.mdw.seabanksvc.com")
//      case "10.213.3.68" => ("https://openapi.seatalk.io/webhook/group/5D8nePbpS8-8bJe8ymClVg", "squid-nonlive.mdw.maribanksvc.com")
//      case "10.162.9.111" => ("https://openapi.seatalk.io/webhook/group/GLcOmOU7QgWGluwicguS9w", "squid-proxy-id.bke.shopee.io") // id live
//      case "10.162.136.16" => ("https://openapi.seatalk.io/webhook/group/GLcOmOU7QgWGluwicguS9w", "squid-proxy-id.bke.shopee.io") // id dr
//      case "10.163.95.160" => ("https://openapi.seatalk.io/webhook/group/GLcOmOU7QgWGluwicguS9w", "squid.mdw.seabanksvc.com") // ph live
//      case "10.163.190.160" => ("https://openapi.seatalk.io/webhook/group/GLcOmOU7QgWGluwicguS9w", "squid.mdw.seabanksvc.com") // ph dr
//      case "10.165.95.160" => ("https://openapi.seatalk.io/webhook/group/GLcOmOU7QgWGluwicguS9w", "squid.mdw.maribanksvc.com") // sg live
//      case "10.165.195.162" => ("https://openapi.seatalk.io/webhook/group/GLcOmOU7QgWGluwicguS9w", "squid.mdw.maribanksvc.com")  // sg dr
//      case _ => throw new Exception("invalid sql-parser url")
//    }
//  }
}

class SparkMetricReportListener extends SparkListener {
  private val executorMetrics = mutable.HashMap.empty[(String, String), Long]
  private val errMsg = mutable.HashMap.empty[(String, String), String]
  var startTime: Long = 0
  var endTime: Long = 0
  var appId, name, host, port = ""
  var preRule:java.util.List[String] = new java.util.ArrayList
  var optRule:java.util.Set[String] = new java.util.HashSet[String]()
  var allRule:java.util.HashMap[String,String] = new java.util.HashMap
  var jobConfig:java.util.HashMap[String,String] = new java.util.HashMap
  var sql:String = ""
  val JVMMetrics:Array[(String, String)] = Array(
    ("JVMHeapMemory", "Peak JVM Memory On Heap"),
    ("JVMOffHeapMemory", "Peak JVM Memory Off Heap"),
    ("OnHeapExecutionMemory", "Peak Execution Memory On Heap"),
    ("OffHeapExecutionMemory", "Peak Execution Memory Off Heap"),
    ("OnHeapStorageMemory", "Peak On Heap Storage Memory"),
    ("OffHeapStorageMemory", "Peak Off Heap Storage Memory"),
    ("OnHeapUnifiedMemory", "On Heap Unified Memory"),
    ("OffHeapUnifiedMemory","Off Heap Unified Memory"),
    ("DirectPoolMemory", "Peak Pool Memory Direct"),
    ("MappedPoolMemory", "Peak Pool Memory Mapped"),
    ("MinorGCCount", "Minor GC Count"),
    ("MinorGCTime", "Minor GC Time"),
    ("MajorGCCount", "Major GC Count"),
    ("MajorGCTime", "Major GC Time"),
//    ("TotalGCTime", "Total GC Time"),
    ("ProcessTreeJVMVMemory", "Peak JVM VMemory Process Tree"),
    ("ProcessTreeJVMRSSMemory", "Peak JVM RSS Memory Process Tree"),
    ("ProcessTreePythonVMemory", "Peak Python VMemory ProcessTree"),
    ("ProcessTreePythonRSSMemory", "Peak Python RSS Memory ProcessTree"),
    ("ProcessTreeOtherVMemory", "Peak OtherVMemory ProcessTree"),
    ("ProcessTreeOtherRSSMemory", "Peak Other RSS Memory ProcessTree")
  )

  override def onApplicationStart(applicationStart: SparkListenerApplicationStart): Unit = {
    startTime = System.currentTimeMillis()
  }

  override def onJobStart(jobStart: SparkListenerJobStart): Unit = {
    val spark = SparkSession.getActiveSession.getOrElse(SparkSession.builder().getOrCreate())
    appId = spark.sparkContext.getConf.get("spark.app.id")
    name = spark.sparkContext.getConf.get("spark.app.name")
    host = spark.sparkContext.getConf.get("spark.sql.parser.host")
    port = spark.sparkContext.getConf.get("spark.sql.parser.port")
    if (jobConfig.size() == 0) {
      val sparkConfMap: mutable.HashMap[String, String] = mutable.HashMap(
        spark.sparkContext.getConf.getAll: _*
      )
      sparkConfMap.foreach { case (k, v) => {
        jobConfig.put(k, v)
        }
      }
    }
  }

  override def onExecutorMetricsUpdate(executorMetricsUpdate: SparkListenerExecutorMetricsUpdate): Unit = {
    try {
      val execId = executorMetricsUpdate.execId
      val map = executorMetricsUpdate.executorUpdates.asJava
      map.entrySet().forEach(k => {
        JVMMetrics.foreach(name => {
          val key = (execId, name._2)
          if (executorMetrics.contains(key)) {
            if (executorMetrics.getOrElse(key, 0).asInstanceOf[Long] < k.getValue.getMetricValue(name._1).longValue())
              executorMetrics.put(key, k.getValue.getMetricValue(name._1))
          } else {
            executorMetrics.put(key, k.getValue.getMetricValue(name._1))
          }
        })
      })
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }

  override def onStageCompleted(stageCompleted: SparkListenerStageCompleted): Unit = {
    try {
      val sparkMetric: SparkStageMetric = new SparkStageMetric
      sparkMetric.setYarnApplicationId(appId)
      sparkMetric.setYarnApplicationName(name)
      sparkMetric.setStageId(stageCompleted.stageInfo.stageId)
      sparkMetric.setStageName(stageCompleted.stageInfo.name)
      sparkMetric.setAttemptNumber(stageCompleted.stageInfo.attemptNumber())
      sparkMetric.setFailReason(stageCompleted.stageInfo.failureReason.getOrElse(""))
      sparkMetric.setSubmissionTime(stageCompleted.stageInfo.submissionTime.getOrElse(0l).asInstanceOf[java.lang.Long])
      sparkMetric.setCompletionTime(stageCompleted.stageInfo.completionTime.getOrElse(0l).asInstanceOf[java.lang.Long])
      sparkMetric.setRddInfo(stageCompleted.stageInfo.rddInfos.asJava)
      val hashMap = new java.util.HashMap[String, Object]()
      stageCompleted.stageInfo.accumulables.foreach(o => hashMap.put(o._2.name.getOrElse(""), o._2.value.get.asInstanceOf[Object]))
      sparkMetric.setMetrics(hashMap)
      reportSparkStageMetric(sparkMetric, host, port)
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }

  override def onApplicationEnd(applicationEnd: SparkListenerApplicationEnd): Unit = {
    try {
      endTime = System.currentTimeMillis()
      reportSparkExecutorMetric(appId, name, executorMetrics, host, port, startTime, endTime, this.allRule, this.preRule, this.optRule, this.sql, this.jobConfig)
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }

  override def onOtherEvent(event: SparkListenerEvent): Unit = {
    try{
      event match {
        case p: SparkListenerSQLExecutionEnd => {
          val qe = getField[QueryExecution](p, "qe")
          if (qe == null) return
          //try {this.sql = qe.executedPlan.origin.sqlText.get} catch {case e:Throwable =>}
          this.sql = ""
          try {
            val preRule:Seq[Rule[SparkPlan]] = getField(qe.executedPlan, "queryStagePreparationRules")
            preRule.foreach(o => this.preRule.add(o.ruleName))
          } catch {case e:Throwable =>}
          try {
            val optRule:Seq[Rule[SparkPlan]] = getField(qe.executedPlan, "queryStageOptimizerRules")
            optRule.foreach(o => this.optRule.add(o.ruleName))
          }catch {case e:Throwable =>}
          try {
            qe.tracker.rules.foreach(o => this.allRule.put(o._1, o._2.toString()))
          }catch {case e:Throwable =>}
        }
        case _ =>
      }
    } catch {
      case e:Throwable => e.printStackTrace()
    }
  }

  override def onTaskEnd(taskEnd: SparkListenerTaskEnd): Unit = {
    try {
      if (null == taskEnd) return
      val execId = taskEnd.taskInfo.executorId
      if (null ==  taskEnd.taskMetrics) return
      val memoryBytesSpilled = taskEnd.taskMetrics.memoryBytesSpilled
      accumulate(executorMetrics, execId, "Spill (Memory)", memoryBytesSpilled)
      val diskBytesSpilled = taskEnd.taskMetrics.diskBytesSpilled
      accumulate(executorMetrics, execId, "Spill (Disk)", diskBytesSpilled)
      val bytesWritten = taskEnd.taskMetrics.shuffleWriteMetrics.bytesWritten
      accumulate(executorMetrics, execId, "Shuffle Write Size", bytesWritten)
      val recordsWritten = taskEnd.taskMetrics.shuffleWriteMetrics.recordsWritten
      accumulate(executorMetrics, execId, "Shuffle Write Records", recordsWritten)
      val writeTime = taskEnd.taskMetrics.shuffleWriteMetrics.writeTime
      accumulate(executorMetrics, execId, "Shuffle Write Time(nanoseconds)", writeTime)
      val recordsRead = taskEnd.taskMetrics.shuffleReadMetrics.recordsRead
      accumulate(executorMetrics, execId, "Shuffle Read Records", recordsRead)
      val totalBytesRead = taskEnd.taskMetrics.shuffleReadMetrics.totalBytesRead
      accumulate(executorMetrics, execId, "Shuffle Read Size", totalBytesRead)
      val remoteBlocksFetched = taskEnd.taskMetrics.shuffleReadMetrics.remoteBlocksFetched
      accumulate(executorMetrics, execId, "Shuffle Remote Blocks Fetched", remoteBlocksFetched)
      val remoteBytesRead = taskEnd.taskMetrics.shuffleReadMetrics.remoteBytesRead
      accumulate(executorMetrics, execId, "Shuffle Remote Bytes Read", remoteBytesRead)
      val remoteBytesReadToDisk = taskEnd.taskMetrics.shuffleReadMetrics.remoteBytesReadToDisk
      accumulate(executorMetrics, execId, "Shuffle Remote Bytes Read To Disk", remoteBytesReadToDisk)
//      val remoteMergedBlocksFetched = taskEnd.taskMetrics.shuffleReadMetrics.remoteMergedBlocksFetched
//      accumulate(executorMetrics, execId, "Shuffle Remote Merged Blocks Fetched", remoteMergedBlocksFetched)
//      val remoteMergedBytesRead = taskEnd.taskMetrics.shuffleReadMetrics.remoteMergedBytesRead
//      accumulate(executorMetrics, execId, "Shuffle Remote Merged Bytes Read", remoteMergedBytesRead)
//      val remoteMergedChunksFetched = taskEnd.taskMetrics.shuffleReadMetrics.remoteMergedChunksFetched
//      accumulate(executorMetrics, execId, "Shuffle Remote Merged Chunks Fetched", remoteMergedChunksFetched)
//      val remoteMergedReqsDuration = taskEnd.taskMetrics.shuffleReadMetrics.remoteMergedReqsDuration
//      accumulate(executorMetrics, execId, "Shuffle Remote Merged Reqs Duration", remoteMergedReqsDuration)
//      val remoteReqsDuration = taskEnd.taskMetrics.shuffleReadMetrics.remoteReqsDuration
//      accumulate(executorMetrics, execId, "Shuffle Remote Reqs Duration", remoteReqsDuration)
      val fetchWaitTime = taskEnd.taskMetrics.shuffleReadMetrics.fetchWaitTime
      accumulate(executorMetrics, execId, "Shuffle Fetch Wait Time", fetchWaitTime)
//      val corruptMergedBlockChunks = taskEnd.taskMetrics.shuffleReadMetrics.corruptMergedBlockChunks
//      accumulate(executorMetrics, execId, "Shuffle Corrupt Merged Block Chunks", corruptMergedBlockChunks)
//      val mergedFetchFallbackCount = taskEnd.taskMetrics.shuffleReadMetrics.mergedFetchFallbackCount
//      accumulate(executorMetrics, execId, "Shuffle Merged Fetch Fallback Count", mergedFetchFallbackCount)
      val localBlocksFetched = taskEnd.taskMetrics.shuffleReadMetrics.localBlocksFetched
      accumulate(executorMetrics, execId, "Shuffle Local Blocks Fetched", localBlocksFetched)
      val localBytesRead = taskEnd.taskMetrics.shuffleReadMetrics.localBytesRead
      accumulate(executorMetrics, execId, "Shuffle Local Bytes Read", localBytesRead)
//      val localMergedBlocksFetched = taskEnd.taskMetrics.shuffleReadMetrics.localMergedBlocksFetched
//      accumulate(executorMetrics, execId, "Shuffle Local Merged Blocks Fetched", localMergedBlocksFetched)
//      val localMergedChunksFetched = taskEnd.taskMetrics.shuffleReadMetrics.localMergedChunksFetched
//      accumulate(executorMetrics, execId, "Shuffle Local Merged Chunks Fetched", localMergedChunksFetched)
//      val localMergedBytesRead = taskEnd.taskMetrics.shuffleReadMetrics.localMergedBytesRead
//      accumulate(executorMetrics, execId, "Shuffle Local Merged Bytes Read", localMergedBytesRead)
      val inputBytesRead = taskEnd.taskMetrics.inputMetrics.bytesRead
      accumulate(executorMetrics, execId, "Input Size", inputBytesRead)
      val inputRecordsRead = taskEnd.taskMetrics.inputMetrics.recordsRead
      accumulate(executorMetrics, execId, "Input Records", inputRecordsRead)
      if (taskEnd != null && taskEnd.stageAttemptId != -1) {
        if (taskEnd.taskInfo.failed) {
          accumulate(executorMetrics, execId, "Failed Tasks", 1)
        } else if (taskEnd.taskInfo.killed) {
          accumulate(executorMetrics, execId, "Killed Tasks", 1)
        } else accumulate(executorMetrics, execId, "Success Tasks", 1)
        accumulate(executorMetrics, execId, "Total Tasks", 1)
      }
      val taskDuration = taskEnd.taskInfo.duration
      accumulate(executorMetrics, execId, "Task Time", taskDuration)
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }

  def reportSparkStageMetric(sparkStageMetric: SparkStageMetric, host: String, port: String): Unit = {
    try{
      val url = new URL(String.format("http://%s:%s/sparkStageMetric", host, port))
      val connection: HttpURLConnection = url.openConnection().asInstanceOf[HttpURLConnection]
      connection.setRequestMethod("POST")
      connection.setRequestProperty("Content-Type", "application/json")
      connection.setDoOutput(true)
      connection.setConnectTimeout(5000)
      connection.setReadTimeout(5000)
      val outputStream = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream, "UTF-8"))
      val mapper = new ObjectMapper()
      mapper.registerModule(DefaultScalaModule)
      val req = mapper.writeValueAsString(sparkStageMetric)
      outputStream.write(req)
      outputStream.flush()
      outputStream.close()
      val responseCode = connection.getResponseCode
      if(responseCode != 200) {
        println(s"spark metric Response Code: $responseCode")
      }
      connection.disconnect()
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }

  def reportSparkExecutorMetric(appId: String, name: String, executorMetric: mutable.HashMap[(String, String), Long],
                                host: String, port: String, startTime:Long, endTime:Long, allRule:java.util.HashMap[String, String],
                                preRule:java.util.List[String], optRule:java.util.Set[String], sql:String, jobConfig:java.util.HashMap[String,String]
                               ): Unit = {
    try{
      val url = new URL(String.format("http://%s:%s/sparkExecutorMetric", host, port))
      val connection: HttpURLConnection = url.openConnection().asInstanceOf[HttpURLConnection]
      connection.setRequestMethod("POST")
      connection.setRequestProperty("Content-Type", "application/json")
      connection.setDoOutput(true)
      connection.setConnectTimeout(5000)
      connection.setReadTimeout(5000)
      val outputStream = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream, "UTF-8"))
      val sparkExecutorMetric = new SparkExecutorMetric
      sparkExecutorMetric.setYarnApplicationId(appId)
      sparkExecutorMetric.setYarnApplicationName(name)
      sparkExecutorMetric.setMetrics(executorMetric)
      sparkExecutorMetric.setStartTime(startTime)
      sparkExecutorMetric.setEndTime(endTime)
      sparkExecutorMetric.setAllRule(allRule)
      sparkExecutorMetric.setPreRule(preRule)
      sparkExecutorMetric.setOptRule(optRule)
      sparkExecutorMetric.setSql(sql)
      sparkExecutorMetric.setJobConf(jobConfig)
      val mapper = new ObjectMapper()
      mapper.registerModule(DefaultScalaModule)
      val req = mapper.writeValueAsString(sparkExecutorMetric)
      outputStream.write(req)
      outputStream.flush()
      outputStream.close()
      val responseCode = connection.getResponseCode
      if(responseCode != 200) {
        println(s"spark metric Response Code: $responseCode")
      }
      connection.disconnect()
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }

  private def accumulate(map:mutable.HashMap[(String, String), Long], execId:String, name:String, value:Long): Unit = {
    val key = (execId, name)
    map.put(key,
      map.get(key).getOrElse(0l) + value)
  }
}

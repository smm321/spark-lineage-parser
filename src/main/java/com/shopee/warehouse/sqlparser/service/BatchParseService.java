package com.shopee.warehouse.sqlparser.service;

import com.shopee.warehouse.sqlparser.ColumnLineage;
import com.shopee.warehouse.sqlparser.Lineage;
import com.shopee.warehouse.sqlparser.engine.antlr.service.AntlrParseService;
import com.shopee.warehouse.sqlparser.engine.antlr.service.impl.TableColumnsInfoTabServiceImpl;
import com.shopee.warehouse.sqlparser.engine.spark.StandAloneSparkSession;
import com.shopee.warehouse.sqlparser.engine.spark.helper.SparkSQLLineageParseHelper;
import com.shopee.warehouse.sqlparser.pojo.ColumnLineageResult;
import com.shopee.warehouse.sqlparser.pojo.LineageBatchResult;
import com.shopee.warehouse.sqlparser.pojo.LineageResult;
import com.shopee.warehouse.sqlparser.pojo.SparkStageMetric;
import com.shopee.warehouse.sqlparser.pojo.entity.Limitation;
import com.shopee.warehouse.sqlparser.pojo.entity.TableInfo;
import com.shopee.warehouse.sqlparser.util.LineageUtil;
import com.shopee.warehouse.sqlparser.util.ScalaUtil;
import jodd.util.StringUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan;
import org.apache.spark.sql.execution.CommandExecutionMode;
import org.apache.spark.sql.execution.QueryExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scala.collection.immutable.List;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
public class BatchParseService {

    @Autowired
    private StandAloneSparkSession session;

    @Autowired
    private AntlrParseService antlrParseService;

    @Autowired
    private TableColumnsInfoTabServiceImpl tableColumnsInfoTabService;

    @Autowired
    private MetadataService metadataService;

    private static final Logger logger = LoggerFactory.getLogger(BatchParseService.class);

    private final String sparkPrefix = "spark_catalog.";

    Map<String, LineageBatchResult> map = new HashMap<>();

    private void init(String batchId) {
        LineageBatchResult result = new LineageBatchResult();
        result.setBatchId(batchId);
        map.put(batchId, result);
    }

    public LineageBatchResult getResult(String batchId) {
        LineageBatchResult result = map.get(batchId);
        if (null == result) {
            return null;
        }
        Map<String, Set<String>> duplicateInputSqlPath = new HashMap<>();
        result.getDuplicateInputSqlPath().forEach((k, v) -> {
            if (v.size() > 1) {
                duplicateInputSqlPath.put(k, v);
            }
        });
        result.setDuplicateInputSqlPath(duplicateInputSqlPath);
        map.remove(batchId);
        return result;
    }

    public LineageResult process(String dml, String path, String batchId) {
        if (!this.map.containsKey(batchId)) {
            init(batchId);
        }
        LineageResult spark = null;
        try {
            Pattern pattern = Pattern.compile("\\{\\{(.*?)\\}\\}");
            Matcher matcher = pattern.matcher(dml);
            while (matcher.find()) {
//                String insideBraces = matcher.group(1).trim();
                dml = dml.replaceAll("\\{\\{.*?\\}\\}", " ").trim();
//                if (insideBraces.contains("var.value") && insideBraces.contains("db_prefix")) {
//                    dml = dml.replaceAll("\\{\\{.*?\\}\\}", "").trim();
//                    System.out.println("Cleaned: " + dml);
//                }
            }

            logger.info("parse sql " + dml);
            spark = sparkParseLineage(dml);
        } catch (Exception e) {
            String[] sqls = dml.split(";");
            if (null != sqls) {
                try {
                    spark = sparkParseLineage(sqls[0]);
                } catch (Exception e1) {
                    logger.error("bad sql {}", e1.getMessage());
                    if (!e1.getMessage().contains("TABLE_OR_VIEW_NOT_FOUND")) {
                        map.get(batchId).processBadSql(path, e1.getMessage());
                    }
                    throw e1;
                }
            }
        }
        LineageResult antlr = new LineageResult();
        try {
            antlr = antlrParseService.doParse(dml);
        } catch (Exception ignored) {}

        LineageResult gap = LineageUtil.getGaps(spark, antlr);
        gap.setOutputTable(spark.getOutputTable());
        LineageResult score = LineageUtil.score(spark, antlr, gap);
        score.setPath(path);
        if (!CollectionUtils.isEmpty(score.getInputTable())) {
            score.setPtDate(batchId.substring(0, 10));
            metadataService.notifyLineageResult(score);
        }

        map.get(batchId).updateResult(gap, path, spark.getOutputTable(), spark.getColumnLineages().size());
        return gap;
    }

    private LineageResult sparkParseLineage(String dml){
        try {
            LineageResult result = new LineageResult();
            result.setOriginalSql(dml);

            LogicalPlan plan = session.getSparkSession().sessionState().sqlParser().parsePlan(dml);
            QueryExecution qe = session.getSparkSession().sessionState().executePlan(plan, CommandExecutionMode.SKIP());
            LogicalPlan logicalPlan = qe.analyzed();
            Lineage lineage = SparkSQLLineageParseHelper.apply(session.getSparkSession())
                    .transformToLineage(0, logicalPlan);
            List<ColumnLineage> columnLineageList = lineage.columnLineage();
            result.setInputTable(ScalaUtil.convertScalaListToJavaList(lineage.inputTables()));
            result.setOutputTable(lineage.outputTables().head());
            TableInfo tableInfo = new TableInfo();
            tableInfo.setSchemaName(result.getOutputTable().split("\\.")[1]);
            tableInfo.setObjName(result.getOutputTable().split("\\.")[2]);
            java.util.List<String> partitions = tableColumnsInfoTabService.getPartitionColumn(tableInfo);
            columnLineageList.foreach(o -> {
                String column = o.column();
                ColumnLineageResult columnLineageResult = new ColumnLineageResult(column,
                        ScalaUtil.convertScalaSetToJavaList(o.originalColumns()));
                if (!partitions.contains(column.split("\\.")[2])) {
                    result.append(columnLineageResult);
                }
                return null;
            });
            result.setLimitations(ScalaUtil.getLimitationAsJava(lineage));
            trimSparkCatalog(result);
            return result;
        } catch (Exception e) {
            logger.error("ParseService execution error {}", e.getMessage());
            throw new RuntimeException("Sql Syntax Error:" + e.getMessage());
        }
    }

    private void trimSparkCatalog(LineageResult result) {
        result.setInputTable(result.getInputTable()
                .stream()
                .map(o -> o.replace(sparkPrefix, ""))
                .collect(Collectors.toList()));
        result.setOutputTable(result.getOutputTable().replace(sparkPrefix, ""));
        result.setColumnLineages(result.getColumnLineages().stream().map(o -> {
            ColumnLineageResult columnLineageResult = new ColumnLineageResult();
            columnLineageResult.setColumnName(o.getColumnName().replace(sparkPrefix, ""));
            columnLineageResult.setOriginal(o.getOriginal()
                    .stream()
                    .map(k -> k.replace(sparkPrefix, ""))
                    .collect(Collectors.toList())
            );
            return columnLineageResult;
        }).collect(Collectors.toList()));
    }

    public void sparkStageMetric(SparkStageMetric request){

    }

    public void listenerLineage(LineageResult request){
        try {
            String batchId = DateFormatUtils.format(new Date(System.currentTimeMillis()),
                    "yyyy-MM-dd");

            if (StringUtil.isEmpty(request.getOutputTable()) || CollectionUtils.isEmpty(request.getInputTable())) {
                return;
            }
            request.setInputTable(request.getInputTable().stream()
                    .map(o -> o.replace("spark_catalog.", "")).collect(Collectors.toList()));
            request.setOutputTable(request.getOutputTable().replace("spark_catalog.", ""));
            request.setColumnLineages(request.getColumnLineages().stream().map(o -> {
                o.setColumnName(o.getColumnName().replace("spark_catalog.", ""));
                o.setOriginal(o.getOriginal().stream().map(k -> k.replace("spark_catalog.", ""))
                        .collect(Collectors.toList()));
                return o;
            }).collect(Collectors.toList()));
            request.setPtDate(batchId);
            request.setLineageType("listener");
            metadataService.notifyLineageResult(request);
            if (!this.map.containsKey(batchId)) {
                init(batchId);
            }
            map.get(batchId).updateListenerResult(request.getOutputTable());
        } catch (Exception e) {
            logger.error("listenerLineage error", e);
            throw e;
        }
    }
}

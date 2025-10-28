package com.shopee.warehouse.sqlparser.pojo;

import com.google.common.collect.Sets;
import lombok.Data;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LineageBatchResult {
    private String batchId = "";
    private int parseSuccessSql = 0;

    public String getBatchId() {
        return batchId;
    }

    public int getParseSuccessSql() {
        return parseSuccessSql;
    }

    public void setParseSuccessSql(int parseSuccessSql) {
        this.parseSuccessSql = parseSuccessSql;
    }

    public int getTableGapCount() {
        return tableGapCount;
    }

    public void setTableGapCount(int tableGapCount) {
        this.tableGapCount = tableGapCount;
    }

    public int getColumnGapCount() {
        return columnGapCount;
    }

    public void setColumnGapCount(int columnGapCount) {
        this.columnGapCount = columnGapCount;
    }

    public int getTotalColumnCount() {
        return totalColumnCount;
    }

    public void setTotalColumnCount(int totalColumnCount) {
        this.totalColumnCount = totalColumnCount;
    }

    public Set<String> getListenerParsedTable() {
        return listenerParsedTable;
    }

    public void setListenerParsedTable(Set<String> listenerParsedTable) {
        this.listenerParsedTable = listenerParsedTable;
    }

    public List<String> getParsedTable() {
        return parsedTable;
    }

    public void setParsedTable(List<String> parsedTable) {
        this.parsedTable = parsedTable;
    }

    public List<String> getTableGapPaths() {
        return tableGapPaths;
    }

    public void setTableGapPaths(List<String> tableGapPaths) {
        this.tableGapPaths = tableGapPaths;
    }

    public List<String> getColumnGapPaths() {
        return columnGapPaths;
    }

    public void setColumnGapPaths(List<String> columnGapPaths) {
        this.columnGapPaths = columnGapPaths;
    }

    public List<String> getBadSql() {
        return badSql;
    }

    public void setBadSql(List<String> badSql) {
        this.badSql = badSql;
    }

    public List<String> getGapOutputTable() {
        return gapOutputTable;
    }

    public void setGapOutputTable(List<String> gapOutputTable) {
        this.gapOutputTable = gapOutputTable;
    }

    private int tableGapCount = 0;
    private int columnGapCount = 0;
    private int totalColumnCount = 0;

    private Set<String> listenerParsedTable = new HashSet<>();
    private List<String> parsedTable = new ArrayList();
    private List<String> tableGapPaths = new ArrayList();
    private List<String> columnGapPaths = new ArrayList();
    private List<String> badSql = new ArrayList();
    private List<String> gapOutputTable = new ArrayList();
    private Map<String, Set<String>> duplicateInputSqlPath = new HashMap<>();

    public void processDuplicateInputSqlPath(String path, String outputTable) {
        if (duplicateInputSqlPath.containsKey(outputTable)) {
            duplicateInputSqlPath.get(outputTable).add(path);
        } else {
            duplicateInputSqlPath.put(outputTable, Sets.newHashSet(path));
        }
    }

    public void processTableGap(LineageResult gap, String path, String outputTable) {
        if (CollectionUtils.isNotEmpty(gap.getInputTable())) {
            tableGapCount++;
            tableGapPaths.add(path);
            gapOutputTable.add(outputTable);
        }
    }

    public void processColumnGap(LineageResult gap, String path) {
        if (!CollectionUtils.isEmpty(gap.getColumnLineages())) {
            columnGapCount += gap.getColumnLineages().size();
            columnGapPaths.add(path);
        }
    }

    public void processBadSql(String path, String errorMsg) {
        if (errorMsg.length() > 400) {
            errorMsg = errorMsg.substring(0, 400);
        }
        badSql.add(path + " 错误信息摘要: [" + errorMsg + " ...]");
    }

    public void processParseSuccessSql() {
        parseSuccessSql += 1;
    }

    public void processTotalColumnCount(int count) {
        this.totalColumnCount += count;
    }

    public void processParsedTable(String outputTable) {
        if (StringUtils.isNotEmpty(outputTable)) {
            this.parsedTable.add(outputTable);
        }
    }

    public void updateResult(LineageResult gap, String path, String outputTable, int count) {
        processParsedTable(outputTable);
        processDuplicateInputSqlPath(path, outputTable);
        processTableGap(gap, path, outputTable);
        processColumnGap(gap, path);
        processParseSuccessSql();
        processTotalColumnCount(count);
    }

    public void updateListenerResult(String outputTable) {
        if (StringUtils.isNotEmpty(outputTable)) {
            listenerParsedTable.add(outputTable);
        }
    }

    public void setBatchId(String id) {
        this.batchId = id;
    }

    public Map<String, Set<String>> getDuplicateInputSqlPath() {
        return this.duplicateInputSqlPath;
    }

    public void setDuplicateInputSqlPath(Map<String, Set<String>> path) {
        this.duplicateInputSqlPath = path;
    }
}

package com.shopee.warehouse.sqlparser.pojo;

import com.shopee.warehouse.sqlparser.pojo.entity.Limitation;
import com.shopee.warehouse.sqlparser.pojo.entity.LimitedRelaTVO;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LineageResult{

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String path;

    private String ptDate = "";

    public String getLineageType() {
        return lineageType;
    }

    public void setLineageType(String lineageType) {
        this.lineageType = lineageType;
    }

    private String lineageType = "sql-parser";
    private String originalSql;
    private String outputTable;
    private List<String> inputTable;
    private List<Integer> inputTableScore = new ArrayList<>();
    private List<ColumnLineageResult> columnLineages = new ArrayList<>();
    private List<LimitedRelaTVO> limitRelation = new ArrayList<>();

    public String getOriginalSql() {
        return originalSql;
    }

    public void setInputTableScore(List<Integer> inputTableScore) {
        this.inputTableScore = inputTableScore;
    }

    public List<Limitation> getLimitations() {
        return limitations;
    }

    public void setLimitations(List<Limitation> limitations) {
        this.limitations = limitations;
    }

    private List<Limitation> limitations = new ArrayList<>();

    public void append(ColumnLineageResult columnLineage) {
        columnLineages.add(columnLineage);
    }

    public boolean equals(LineageResult another){
        if (!this.outputTable.equals(another.getOutputTable())) {
            return false;
        }
        if (!CollectionUtils.isEqualCollection(this.columnLineages, another.getColumnLineages())) {
            return false;
        }
        return true;
    }

    public String getOutputTable() {
        return outputTable;
    }

    public List<ColumnLineageResult> getColumnLineages() {
        return columnLineages;
    }

    public void setOriginalSql (String sql) {
        this.originalSql = sql;
    }

    public void setOutputTable(String outputTable) {
        this.outputTable = outputTable.toLowerCase();
    }

    public void setInputTable(List<String> list) {
        this.inputTable = list.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    public List<String> getInputTable() {
        return inputTable;
    }

    public void setColumnLineages(List<ColumnLineageResult> columnLineages) {
        Collections.sort(columnLineages, Comparator.comparing(ColumnLineageResult::getColumnName));
        this.columnLineages = columnLineages;
    }

    public void setLimitRelation(List<LimitedRelaTVO> limitRelation) {
        this.limitRelation = limitRelation;
    }

    public void setInputTableScore(String inputTable, int score) {
        try {
            if (null == this.inputTableScore) {
                inputTableScore = new ArrayList<>();
            }
            int idx = this.getInputTable().indexOf(inputTable);
            inputTableScore.set(idx, score);
        } catch (Exception ignored) {

        }
    }

    public void initTableScore(int score) {
        for(int i = 0; i < this.getInputTable().size(); i++) {
            inputTableScore.add(i, score);
        }
    }

    public List<LimitedRelaTVO> getLimitRelation(){
        return this.limitRelation;
    }

    public List<Integer> getInputTableScore(){
        return this.inputTableScore;
    }

    public String getPtDate() {
        return ptDate;
    }

    public void setPtDate(String date) {
        this.ptDate = date;
    }

    @Override
    public String toString() {
        return "LineageResult{" +
                "path='" + path + '\'' +
                ", ptDate='" + ptDate + '\'' +
                ", lineageType='" + lineageType + '\'' +
                ", originalSql='" + originalSql + '\'' +
                ", outputTable='" + outputTable + '\'' +
                ", inputTable=" + inputTable +
                ", inputTableScore=" + inputTableScore +
                ", columnLineages=" + columnLineages +
                ", limitRelation=" + limitRelation +
                ", limitations=" + limitations +
                '}';
    }
}

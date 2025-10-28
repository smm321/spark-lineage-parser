package com.shopee.warehouse.sqlparser.pojo.entity;

import com.shopee.warehouse.sqlparser.pojo.ColumnLineageResult;
import com.shopee.warehouse.sqlparser.pojo.LineageResult;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParseResult {

    private List<DataRelaColumnVO> DataRelaColumnVOs;
    private List<LimitedRelaTVO> LimitedRelaTVOs;

    private Set<TableInfo> allTables;
    private Set<ColumnInfo> allColumns;
    private Set<String> allPartitions;

    public Set<String> getAllPartitions() {
        return allPartitions;
    }

    public void setAllPartitions(Set<String> allPartitions) {
        this.allPartitions = allPartitions;
    }

    public Set<TableInfo> getAllTables() {
        return allTables;
    }

    public void setAllTables(Set<TableInfo> allTables) {
        this.allTables = allTables;
    }

    public Set<ColumnInfo> getAllColumns() {
        return allColumns;
    }

    public void setAllColumns(Set<ColumnInfo> allColumns) {
        this.allColumns = allColumns;
    }

    private String scriptName;

    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public List<DataRelaColumnVO> getDataRelaColumnVOs() {
        return DataRelaColumnVOs;
    }

    public void setDataRelaColumnVOs(List<DataRelaColumnVO> dataRelaColumnVOs) {
        DataRelaColumnVOs = dataRelaColumnVOs;
    }

    public List<LimitedRelaTVO> getLimitedRelaTVOs() {
        return LimitedRelaTVOs;
    }

    public void setLimitedRelaTVOs(List<LimitedRelaTVO> limitedRelaTVOs) {
        LimitedRelaTVOs = limitedRelaTVOs;
    }

    @Override
    public String toString() {

        if (this==null){
            return "null";
        }
        StringBuilder sb = new StringBuilder("\n");

        if (DataRelaColumnVOs!=null) {
            for (DataRelaColumnVO dataRelaColumnVO :
                    DataRelaColumnVOs) {
                sb.append(dataRelaColumnVO).append("\n");
            }
        }
        if (LimitedRelaTVOs!=null) {
            for (LimitedRelaTVO limitedRelaTVO :
                    LimitedRelaTVOs) {
                sb.append(limitedRelaTVO).append("\n");
            }
        }
        return sb.toString();
    }

    public LineageResult toLineageResult() {
        LineageResult lineageResult = new LineageResult();
        Map<String, Set<String>> columnLineage = new HashMap<>();

        DataRelaColumnVOs.forEach(o -> {
            lineageResult.setOutputTable(o.getSrcObjId().split("\\.")[0] + "." + o.getSrcObjId().split("\\.")[1]);
            if (columnLineage.containsKey(o.getTgtObjId())) {
                columnLineage.get(o.getTgtObjId()).add(o.getSrcObjId());
            } else {
                columnLineage.put(o.getTgtObjId(), Stream.of(o.getSrcObjId()).collect(Collectors.toSet()));
            }
        });
        lineageResult.setInputTable(allTables.stream().map(o -> StringUtils.join(o.getSchemaName(), ".", o.getObjName())).collect(Collectors.toList()));
        List<ColumnLineageResult> columnLineageResult = new ArrayList<>();
        columnLineage.forEach((k, v) -> {
            columnLineageResult.add(new ColumnLineageResult(k, new ArrayList<>(v)));
        });
        lineageResult.setColumnLineages(columnLineageResult);
        lineageResult.setLimitRelation(LimitedRelaTVOs);
        return lineageResult;
    }
}

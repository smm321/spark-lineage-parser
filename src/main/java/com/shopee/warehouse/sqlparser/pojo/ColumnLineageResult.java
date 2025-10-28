package com.shopee.warehouse.sqlparser.pojo;

import org.apache.commons.collections4.ListUtils;
import org.datanucleus.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

public class ColumnLineageResult{
    private String columnName;
    private List<String> original;
    private int score;

    public ColumnLineageResult(String column, List<String> list) {
        this.columnName = column.toLowerCase();
        this.original = list.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    public ColumnLineageResult(){

    }

    public String getColumnName(){
        return columnName;
    }

    public List<String> getOriginal() {
        return original;
    }

    public void setOriginal(List<String> original) {
        this.original = original.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName.toLowerCase(Locale.ROOT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColumnLineageResult that = (ColumnLineageResult) o;
        original = original.stream().filter(obj -> !(StringUtils.isEmpty(obj)||obj.equals("constant.constant.constant"))).collect(Collectors.toList());
        Collections.sort(original);
        Collections.sort(that.original.stream().filter(obj -> !(StringUtils.isEmpty(obj)||obj.equals("constant.constant.constant"))).collect(Collectors.toList()));
        return columnName.equals(that.columnName) && ListUtils.isEqualList(original, that.original);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, original);
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public int getScore(){
        return score;
    }
}

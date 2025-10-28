package com.shopee.warehouse.sqlparser.pojo.entity;

import java.util.Objects;

public class ColumnInfo {

    private String columnName;
    private TableInfo tableInfo;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public TableInfo getTableInfo() {
        return tableInfo;
    }

    public void setTableInfo(TableInfo tableInfo) {
        this.tableInfo = tableInfo;
    }

    @Override
    public String toString() {
        return "ColumnInfo{" +
                "columnName='" + columnName + '\'' +
                ", tableInfo=" + tableInfo +
                '}';
    }

    public ColumnInfo(String columnName, TableInfo tableInfo) {
        this.columnName = columnName;
        this.tableInfo = tableInfo;
    }

    public ColumnInfo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColumnInfo that = (ColumnInfo) o;
        return Objects.equals(columnName==null?null:columnName.toUpperCase(), that.columnName==null?null:that.columnName.toUpperCase()) && Objects.equals(tableInfo, that.tableInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName==null?null:columnName.toUpperCase(), tableInfo);
    }
}

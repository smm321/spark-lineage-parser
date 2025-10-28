package com.shopee.warehouse.sqlparser.pojo.entity;

import java.util.Objects;

public class TableInfo {

    private String schemaName;
    private String objName;

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    @Override
    public String toString() {
        return "TableInfo{" +
                "schemaName='" + schemaName + '\'' +
                ", objName='" + objName + '\'' +
                '}';
    }

    public TableInfo(String schemaName, String objName) {
        this.schemaName = schemaName;
        this.objName = objName;
    }

    public TableInfo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableInfo tableInfo = (TableInfo) o;

        return Objects.equals(schemaName==null? null :schemaName.toUpperCase(), tableInfo.schemaName==null? null :tableInfo.schemaName.toUpperCase()) &&
                Objects.equals(objName==null? null :objName.toUpperCase(), tableInfo.objName==null? null :tableInfo.objName.toUpperCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaName==null? null :schemaName.toUpperCase(), objName==null? null :objName.toUpperCase());
    }
}

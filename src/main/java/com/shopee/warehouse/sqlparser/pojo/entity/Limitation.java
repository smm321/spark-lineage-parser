package com.shopee.warehouse.sqlparser.pojo.entity;

public class Limitation {
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getLimitExpr() {
        return limitExpr;
    }

    public void setLimitExpr(String limitExpr) {
        this.limitExpr = limitExpr;
    }

    private String columnName;
    private String limitExpr;

    @Override
    public String toString() {
        return "Limitation{" +
                "columnName='" + columnName + '\'' +
                ", limitExpr='" + limitExpr + '\'' +
                '}';
    }
}

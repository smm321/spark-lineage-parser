package com.shopee.warehouse.sqlparser.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TableColumnDependencyAntlrDO implements Serializable {


    private String db;

    private String tname;

    private String col;

    private String parentDb;

    private String parentTname;

    private String parentCol;

    private String ptype = "antlr";

    private String expr = "";

    private Date createTime = new Date();

    private Date updateTime = new Date();

    private String scriptName;

    private String relationType;


    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getParentDb() {
        return parentDb;
    }

    public void setParentDb(String parentDb) {
        this.parentDb = parentDb;
    }

    public String getParentTname() {
        return parentTname;
    }

    public void setParentTname(String parentTname) {
        this.parentTname = parentTname;
    }

    public String getParentCol() {
        return parentCol;
    }

    public void setParentCol(String parentCol) {
        this.parentCol = parentCol;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
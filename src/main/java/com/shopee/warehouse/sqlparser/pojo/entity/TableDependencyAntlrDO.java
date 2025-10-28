package com.shopee.warehouse.sqlparser.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Data
public class TableDependencyAntlrDO implements Serializable {


    private String db;

    private String tname;

    private String parentDb;

    private String parentTname;

    private String ptype = "antlr";
    private String sourceIp = "";
    private String sourcePort = "";
    private String sourceDbType = "";

    private String expr = "";

    private Date createTime = new Date();

    private Date updateTime = new Date();

    private String scriptName;

    private String relationType;

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public String getSourceDbType() {
        return sourceDbType;
    }

    public void setSourceDbType(String sourceDbType) {
        this.sourceDbType = sourceDbType;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableDependencyAntlrDO that = (TableDependencyAntlrDO) o;
        return Objects.equals(db, that.db) && Objects.equals(tname, that.tname) && Objects.equals(parentDb, that.parentDb) && Objects.equals(parentTname, that.parentTname) && Objects.equals(scriptName, that.scriptName) && Objects.equals(relationType, that.relationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(db, tname, parentDb, parentTname, scriptName, relationType);
    }
}
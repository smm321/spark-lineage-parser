package com.shopee.warehouse.sqlparser.pojo.entity;

import java.util.Objects;

public class DataRelaColumnVO {

    private String srcObjId;

    private String tgtObjId;

    public String getSrcObjId() {
        return srcObjId;
    }

    public void setSrcObjId(String srcObjId) {
        this.srcObjId = srcObjId;
    }

    public String getTgtObjId() {
        return tgtObjId;
    }

    public void setTgtObjId(String tgtObjId) {
        this.tgtObjId = tgtObjId;
    }

    public DataRelaColumnVO(String srcObjId, String tgtObjId) {
        this.srcObjId = srcObjId;
        this.tgtObjId = tgtObjId;
    }

    public DataRelaColumnVO() {
    }


    @Override
    public String toString() {
        return "DataRelaColumnVO{" +
                "srcObjId='" + srcObjId + '\'' +
                ", tgtObjId='" + tgtObjId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataRelaColumnVO that = (DataRelaColumnVO) o;
        return srcObjId.equalsIgnoreCase(that.srcObjId) && tgtObjId.equalsIgnoreCase(that.tgtObjId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcObjId.toLowerCase(), tgtObjId.toLowerCase());
    }
}

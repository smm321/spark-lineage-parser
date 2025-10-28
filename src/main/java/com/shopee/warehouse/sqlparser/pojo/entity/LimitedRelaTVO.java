package com.shopee.warehouse.sqlparser.pojo.entity;

import java.util.Objects;

public class LimitedRelaTVO {

    private String limitedObjId;
    private String tgtObjId;

    public String getLimitedObjId() {
        return limitedObjId;
    }

    public void setLimitedObjId(String limitedObjId) {
        this.limitedObjId = limitedObjId;
    }

    public String getTgtObjId() {
        return tgtObjId;
    }

    public void setTgtObjId(String tgtObjId) {
        this.tgtObjId = tgtObjId;
    }

    public LimitedRelaTVO() {
    }

    public LimitedRelaTVO(String limitedObjId, String tgtObjId) {

        this.limitedObjId = limitedObjId;
        this.tgtObjId = tgtObjId;
    }

    @Override
    public String toString() {
        return "LimitedRelaTVO{" +
                "limitedObjId='" + limitedObjId + '\'' +
                ", tgtObjId='" + tgtObjId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LimitedRelaTVO that = (LimitedRelaTVO) o;
        return limitedObjId.equalsIgnoreCase(that.limitedObjId) && tgtObjId.equalsIgnoreCase(that.tgtObjId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limitedObjId.toLowerCase(), tgtObjId.toLowerCase());
    }
}

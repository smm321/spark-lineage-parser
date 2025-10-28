package com.shopee.warehouse.sqlparser.pojo;

import java.util.List;
import java.util.Map;

public class SparkStageMetric {

    private String yarnApplicationId;
    private String yarnApplicationName;
    private Integer stageId;
    private String stageName;
    private Integer attemptNumber;
    private Long submissionTime;
    private Long completionTime;
    private List rddInfo;
    private Map<String, Object> metrics;
    private String failReason;

    public String getYarnApplicationId() {
        return yarnApplicationId;
    }

    public void setYarnApplicationId(String yarnApplicationId) {
        this.yarnApplicationId = yarnApplicationId;
    }

    public String getYarnApplicationName() {
        return yarnApplicationName;
    }

    public void setYarnApplicationName(String yarnApplicationName) {
        this.yarnApplicationName = yarnApplicationName;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public Map<String, Object> getMetrics() {
        return metrics;
    }

    public void setMetrics(Map<String, Object> metrics) {
        this.metrics = metrics;
    }

    public Long getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Long submissionTime) {
        this.submissionTime = submissionTime;
    }

    public Long getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(Long completionTime) {
        this.completionTime = completionTime;
    }

    public List getRddInfo() {
        return rddInfo;
    }

    public void setRddInfo(List rddInfo) {
        this.rddInfo = rddInfo;
    }

    public Integer getAttemptNumber() {
        return attemptNumber;
    }

    public void setAttemptNumber(Integer attemptNumber) {
        this.attemptNumber = attemptNumber;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public String toString() {
        return "SparkStageMetric{" +
                "yarnApplicationId='" + yarnApplicationId + '\'' +
                ", yarnApplicationName='" + yarnApplicationName + '\'' +
                ", stageId=" + stageId +
                ", stageName='" + stageName + '\'' +
                ", submissionTime=" + submissionTime +
                ", completionTime=" + completionTime +
                ", rddInfo=" + rddInfo +
                ", attemptNumber=" + attemptNumber +
                ", metrics=" + metrics +
                ", failReason='" + failReason + '\'' +
                '}';
    }
}

package com.shopee.warehouse.sqlparser.pojo;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaSparkExecutorMetric {
    private String yarnApplicationId;

    public String getYarnApplicationName() {
        return yarnApplicationName;
    }

    public void setYarnApplicationName(String yarnApplicationName) {
        this.yarnApplicationName = yarnApplicationName;
    }

    private String yarnApplicationName;

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setMetrics(Map<String, Object> metrics) {
        this.metrics = metrics;
    }

    private Long startTime;
    private Long endTime;
    private Map<String, Object> metrics = new HashMap<>();

    public Map<String, Object> getJobConf() {
        return jobConf;
    }

    public void setJobConfig(Map<String, Object> config) {
        this.jobConf = config;
    }

    private Map<String, Object> jobConf = new HashMap<>();
    private HashMap allRule;

    public HashMap getAllRule() {
        return allRule;
    }

    public void setAllRule(HashMap allRule) {
        this.allRule = allRule;
    }

    public List<String> getPreRule() {
        return preRule;
    }

    public void setPreRule(List<String> preRule) {
        this.preRule = preRule;
    }

    public List<String> getOptRule() {
        return optRule;
    }

    public void setOptRule(List<String> optRule) {
        this.optRule = optRule;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    private List<String> preRule;
    private List<String> optRule;
    private String sql;

    public String getYarnApplicationId() {
        return yarnApplicationId;
    }

    public void setYarnApplicationId(String yarnApplicationId) {
        this.yarnApplicationId = yarnApplicationId;
    }

    public Map<String, Object> getMetrics() {
        return metrics;
    }

    @JsonAnySetter
    public void addMetric(String key, Object value) {
        this.metrics.put(key, value);
    }
}

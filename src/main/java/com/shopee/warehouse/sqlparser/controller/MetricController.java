package com.shopee.warehouse.sqlparser.controller;

import com.shopee.banking.common.pojo.Result;
import com.shopee.warehouse.sqlparser.pojo.LineageBatchResult;
import com.shopee.warehouse.sqlparser.pojo.JavaSparkExecutorMetric;
import com.shopee.warehouse.sqlparser.pojo.SparkStageMetric;
import com.shopee.warehouse.sqlparser.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricController {

    @Autowired
    private MetricService metricService;

    @PostMapping(value = "/sparkStageMetric")
    public Result<LineageBatchResult> sparkStageMetric(@RequestBody SparkStageMetric req) {
        metricService.sendMsg(req, "sparkStageMetric");
        return Result.success();
    }

    @PostMapping(value = "/sparkExecutorMetric")
    public Result<LineageBatchResult> sparkExecutorStageMetric(@RequestBody JavaSparkExecutorMetric req) {
        metricService.sendMsg(req, "sparkExecutorMetric");
        return Result.success();
    }
}

package com.shopee.warehouse.sqlparser.controller;

import com.shopee.banking.common.pojo.Result;
import com.shopee.warehouse.sqlparser.pojo.LineageBatchResult;
import com.shopee.warehouse.sqlparser.pojo.LineageResult;
import com.shopee.warehouse.sqlparser.service.BatchParseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HiveSqlController {
    private static final Logger logger = LoggerFactory.getLogger(HiveSqlController.class);
    @Autowired
    private BatchParseService parseService;

    @PostMapping(value = "/importBatchScript")
    public Result<LineageResult> importBatchScript(@RequestBody Map<String, String> map) {
        try {
            return Result.success(
                    parseService.process(map.get("dml"), map.get("path"), map.getOrDefault("batchId", ""))
            );
        } catch (Exception e) {
            logger.error("system error ", e);
            return Result.fail(9000, e.getMessage());
        }
    }

    @PostMapping(value = "/getBatchResult")
    public Result<LineageBatchResult> getBatchResult(@RequestBody Map<String, String> map) {
        return Result.success(
                parseService.getResult(map.getOrDefault("batchId", ""))
        );
    }

    @PostMapping(value = "/listenerLineage")
    public Result<LineageBatchResult> listenerLineage(@RequestBody LineageResult req) {
        parseService.listenerLineage(req);
        return Result.success();
    }
}

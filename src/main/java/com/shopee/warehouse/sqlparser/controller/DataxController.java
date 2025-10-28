package com.shopee.warehouse.sqlparser.controller;

import com.shopee.warehouse.sqlparser.pojo.IngestionReport;
import com.shopee.warehouse.sqlparser.service.DataxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataxController {
    private static final Logger logger = LoggerFactory.getLogger(DataxController.class);
    @Autowired
    private DataxService dataxService;
    @PostMapping(value = "/dataxLog")
    public void dataxLog(@RequestBody IngestionReport report) {
        try {
            dataxService.logDatax(report);
        } catch (Exception e) {
            logger.error("system error ", e);
        }
    }
}

package com.shopee.warehouse.sqlparser.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MetricService {

    private static final Logger logger = LoggerFactory.getLogger(MetricService.class);
    @Autowired
    private KafkaClient kafkaClient;

    public void sendMsg(Object entity, String type) {
        try {
            Map hashMap = new HashMap();
            hashMap.put("biz_domain", "dwh");
            hashMap.put("sub_domain", type);
            long time = System.currentTimeMillis();
            hashMap.put("etm", time);
            hashMap.put("rtm", time);
            hashMap.put("message", entity);
            kafkaClient.sendMessage(System.getProperty("topic"), hashMap);
        } catch (Exception e) {logger.error("MetricService error", e);}
    }
}

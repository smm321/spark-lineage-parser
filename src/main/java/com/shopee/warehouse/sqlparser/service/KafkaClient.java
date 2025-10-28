package com.shopee.warehouse.sqlparser.service;

import com.shopee.banking.common.util.JacksonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaClient {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(String topic, Object entity){
        try {
            String content = JacksonUtil.toJSONString(entity);
            kafkaTemplate.send(topic, content);
        } catch (Exception e) {}
    }

}

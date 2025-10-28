package com.shopee.warehouse.sqlparser.service;

import com.alibaba.fastjson.JSONObject;
import com.shopee.banking.common.pojo.Result;
import com.shopee.warehouse.sqlparser.pojo.LineageResult;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MetadataService {

    @Autowired
    private RestTemplate customRestTemplate;

    private static String metadataUrl = System.getProperty("metadataUrl");

    private static final Logger logger = LoggerFactory.getLogger(MetadataService.class);

    public void notifyLineageResult(LineageResult score) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String requestBody = JSONObject.toJSONString(score).replace("spark_catalog.", "");
        HttpEntity<String> requestEntity = new HttpEntity(requestBody, headers);
        Result result = customRestTemplate.postForObject(metadataUrl, requestEntity, Result.class);
        if (null == result || result.isFail()) {
            assert result != null;
            logger.error("send to metadata error " + result.getMsg());
            throw new RuntimeException("notifyLineageResult error");
        }
        logger.info(String.format("send to to metadata success: %s", requestBody));
    }
}

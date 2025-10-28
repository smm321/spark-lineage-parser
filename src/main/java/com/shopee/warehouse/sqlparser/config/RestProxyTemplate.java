package com.shopee.warehouse.sqlparser.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.net.InetSocketAddress;
import java.net.Proxy;

@Slf4j
@Component
public class RestProxyTemplate {

    @Value("${squid.host:10.213.17.192}")
    private String host;
    @Value("${squid.port:3128}")
    private String port;

    private RestTemplate restTemplate;

    @PostConstruct
    public void init(){
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        InetSocketAddress address = new InetSocketAddress(host, Integer.parseInt(port));
        Proxy proxy = new Proxy(Proxy.Type.HTTP,address);
        factory.setProxy(proxy);
        factory.setConnectTimeout(5000);
        factory.setReadTimeout(5000);
        restTemplate = new RestTemplate(factory);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
}


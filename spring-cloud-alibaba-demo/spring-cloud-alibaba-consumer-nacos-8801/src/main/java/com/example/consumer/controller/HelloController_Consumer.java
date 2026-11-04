package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController_Consumer {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello/nacos/{id}")
    public String hello(@PathVariable("id") Integer id) {
        // 用服务名调用，不再写死IP端口
        String result = restTemplate.getForObject(
            "http://spring-cloud-alibaba-provider-8001/hello/nacos/" + id, String.class);
        return "消费者调用结果: " + result;
    }
}

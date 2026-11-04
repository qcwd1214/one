package com.example.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("spring-cloud-alibaba-provider-8001")
public interface FeignService {

    @GetMapping("/hello/nacos/{id}")
    String getPort(@PathVariable("id") Integer id);
}

package com.example.consumer.controller;

import com.example.consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/hifeign")
    public String hello() {
        String result = feignService.getPort(1);
        return "Feign调用结果: " + result;
    }
}

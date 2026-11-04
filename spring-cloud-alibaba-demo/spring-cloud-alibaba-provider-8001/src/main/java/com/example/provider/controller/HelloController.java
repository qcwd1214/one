package com.example.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello/nacos/{id}")
    public String hello(@PathVariable("id") Integer id) {
        return "Hello Nacos! id=" + id + ", 服务端口号: " + port;
    }
}

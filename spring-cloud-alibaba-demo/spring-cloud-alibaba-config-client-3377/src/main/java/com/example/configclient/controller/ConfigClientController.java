package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info: 默认值}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return "配置中心内容: " + configInfo;
    }
}

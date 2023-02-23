package com.jb.msserviceb.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service")
public class MyController {

    @Value("${spring.cloud.consul.discovery.instanceId}")
    private String instanceId;

    @GetMapping("b")
    public String whoAmI() {
        return "Hello from " + instanceId;
    }

}

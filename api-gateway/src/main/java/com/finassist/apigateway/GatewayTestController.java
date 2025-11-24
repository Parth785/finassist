package com.finassist.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayTestController {

    @GetMapping("/finassist/hello")
    public String hello() {
        return "FinAssist API Gateway is up!";
    }
}

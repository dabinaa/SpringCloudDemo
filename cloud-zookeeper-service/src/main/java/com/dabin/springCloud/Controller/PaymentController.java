package com.dabin.springCloud.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName:PaymentController
 * @author: dabin
 * @date: 2021/1/50:30
 */
@RestController
public class PaymentController {
    @Value("server.port")
    private String serverPort;

    @GetMapping(value = "/dabin/zookeeper")
    public String paymentZookeeper() {
        return "dabin" + serverPort + UUID.randomUUID().toString();
    }
}

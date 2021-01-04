package com.dabin.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:PayMentMain8004
 * @author: dabin
 * @date: 2021/1/50:27
 */
@SpringBootApplication
//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@EnableDiscoveryClient
public class PayMentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8004.class, args);
    }
}

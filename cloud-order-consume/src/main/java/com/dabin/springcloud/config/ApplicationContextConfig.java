package com.dabin.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:ApplicationContextConfig
 * @author: dabin
 * @date: 2020/12/2823:58
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //设置默认的负载均衡
    //默认的是轮询方式
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

package com.dabin.springcloud.comntroller;

import com.dabin.springcloud.entities.CommonResult;
import com.dabin.springcloud.entities.Order;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName:OrderController
 * @author: dabin
 * @date: 2020/12/2823:56
 */
@RestController
public class OrderController {
    //可以直接使用eureka中的服务名
    private static final String PAY_URL = "http;//localhost:8001";


    private static DiscoveryClient discoveryClient;

    @Resource
    private RestTemplate restTemplate;

    public CommonResult<Order> create(@RequestBody Order order) {
        return restTemplate.postForObject(PAY_URL + "dabin", null, CommonResult.class);
    }


    @GetMapping("comsumer/getForEntity/{id}")
    public CommonResult<Order> getPayMent(@PathVariable("id") Integer id) {
//        return restTemplate.postForObject(PAY_URL + "dabin", null, CommonResult.class);
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(PAY_URL + "dabin", CommonResult.class);
        if (forEntity.getStatusCode().is2xxSuccessful()) {
            return forEntity.getBody();
        }
        return new CommonResult<>(444, "shibai");
    }

    private Object getDisCovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        List<ServiceInstance> instances = discoveryClient.getInstances("");
        System.out.println(instances);
        return discoveryClient;
    }

}

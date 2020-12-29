package com.dabin.springcloud.comntroller;

import com.dabin.springcloud.entities.CommonResult;
import com.dabin.springcloud.entities.Order;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName:OrderController
 * @author: dabin
 * @date: 2020/12/2823:56
 */
@RestController
public class OrderController {
    private static final String PAY_URL = "http;//localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    public CommonResult<Order> create(@RequestBody Order order) {
        return restTemplate.postForObject(PAY_URL + "dabin", null, CommonResult.class);
    }

}

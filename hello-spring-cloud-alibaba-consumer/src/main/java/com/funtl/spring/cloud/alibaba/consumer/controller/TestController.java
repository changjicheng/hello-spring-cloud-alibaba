package com.funtl.spring.cloud.alibaba.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0  2019/9/19 9:55 by 常继承（jicheng.chang@ucarinc.com）创建
 * @description
 */
@RestController
public class TestController {

    private final RestTemplate restTemplate;
    /**构造注入 单例*/
    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str){
        return restTemplate.getForObject("http://service-provider/echo/"+str,String.class);
    }
}

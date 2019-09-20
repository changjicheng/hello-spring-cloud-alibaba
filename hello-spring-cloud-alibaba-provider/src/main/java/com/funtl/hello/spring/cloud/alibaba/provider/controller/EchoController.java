package com.funtl.hello.spring.cloud.alibaba.provider.controller;
import com.funtl.hello.spring.cloud.alibaba.provider.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0  2019/9/19 9:09 by 常继承（jicheng.chang@ucarinc.com）创建
 * @description 服务提供者（同时也是服务消费者）
 */
@RestController
public class EchoController {
    @Value("${server.port}")
    private String port;
    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string){
        return "Hello Nacos Provider"+string;
    }
    @GetMapping("/lb")
    public String lb(){
        return "Hello Nacos Provider i am from port: " + port;
    }
    @GetMapping("/link")
    public String linkEcho(){
       return consumerService.linkEcho();
    }

}

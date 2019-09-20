package com.funtl.spring.cloud.alibaba.consumer.controller;

import com.funtl.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0  2019/9/19 10:28 by 常继承（jicheng.chang@ucarinc.com）创建
 * @description
 */
/**动态刷新*/
@RefreshScope
@RestController
public class TestEchoController {
    @Autowired
    private EchoService echoService;
    @Value("${user.name}")
    private String username;

    @GetMapping(value = "/feign/echo/{str}")
    public String echo(@PathVariable String str) {
        return echoService.echo(str);
    }

    @GetMapping("/lb")
    public String lb(){
        return echoService.lb();
    }

    @GetMapping(value = "/feign/echo")
    public String echo() {
        return echoService.echo(username);
    }
}

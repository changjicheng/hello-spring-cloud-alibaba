package com.funtl.spring.cloud.alibaba.consumer.service;

import com.funtl.spring.cloud.alibaba.consumer.service.fallback.EchoServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @version 1.0  2019/9/19 10:24 by 常继承（jicheng.chang@ucarinc.com）创建
 * @description
 */
@FeignClient(value = "service-provider",fallback = EchoServiceFallBack.class)
public interface EchoService {
    @GetMapping(value = "/echo/{string}")
    String echo(@PathVariable("string") String string);
    /**测试负载均衡 port*/
    @GetMapping(value = "/lb")
    String lb();
}

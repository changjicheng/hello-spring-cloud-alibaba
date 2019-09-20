package com.funtl.hello.spring.cloud.alibaba.provider.service;

import com.funtl.hello.spring.cloud.alibaba.provider.service.fallback.ConsumerServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @version 1.0  2019/9/20 9:23 by 常继承（jicheng.chang@ucarinc.com）创建
 * @description 调用其他服务 所以 服务提供者也可以是服务消费者
 */
@FeignClient(value = "service-consumer",fallback = ConsumerServiceFallback.class)
public interface ConsumerService {
    @GetMapping("/feign/echo")
    String linkEcho();
}

package com.funtl.spring.cloud.alibaba.consumer.service.fallback;

import com.funtl.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @version 1.0  2019/9/20 8:41 by 常继承（jicheng.chang@ucarinc.com）创建
 * @description 服务熔断实现类 要交给spring 容器管理
 */
@Component
public class EchoServiceFallBack implements EchoService {
    @Override
    public String echo(String string) {
        return "你的网络有问题";
    }

    @Override
    public String lb() {
        return "请联系管理员";
    }
}

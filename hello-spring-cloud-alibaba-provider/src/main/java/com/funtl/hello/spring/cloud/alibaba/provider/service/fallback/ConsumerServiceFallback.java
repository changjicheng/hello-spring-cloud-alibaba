package com.funtl.hello.spring.cloud.alibaba.provider.service.fallback;

import com.funtl.hello.spring.cloud.alibaba.provider.service.ConsumerService;
import org.springframework.stereotype.Component;

/**
 * @version 1.0  2019/9/20 9:59 by 常继承（jicheng.chang@ucarinc.com）创建
 * @description
 */
@Component
public class ConsumerServiceFallback implements ConsumerService {
    @Override
    public String linkEcho() {
        return "请检查您的网络";
    }
}

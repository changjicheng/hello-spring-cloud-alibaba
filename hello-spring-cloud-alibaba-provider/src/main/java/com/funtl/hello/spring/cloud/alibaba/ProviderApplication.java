package com.funtl.hello.spring.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0  2019/9/19 8:59 by 常继承（jicheng.chang@ucarinc.com）创建
 * @description
 */
@SpringBootApplication
/** spring cloud 原生注解 开启服务注册发现功能*/
@EnableDiscoveryClient
@EnableFeignClients
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}

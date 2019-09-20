package com.funtl.spring.cloud.alibaba.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0  2019/9/19 9:46 by 常继承（jicheng.chang@ucarinc.com）创建
 * @description
 */
@SpringBootApplication
/** spring cloud 原生注解 开启服务注册发现功能*/
@EnableDiscoveryClient
/**开启feign，服务间的通信使用feign（伪HTTP客户端，实现了负载均衡）*/
@EnableFeignClients
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}

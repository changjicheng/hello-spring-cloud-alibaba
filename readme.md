### 介绍：
1. 微服务模块化开发：两种，1.一个服务一个工程（防背叛，避免拥有所有项目权限），2.一个工程多个服务（企业一般是这种）。

2. hello-spring-cloud-alibaba，只是一个工程不是一个项目，这个工程下面有多个服务。其实就是一个管理模块的项目，其中有一个模块比较特殊 就是dependencies(依赖统一管理模块)。
3. spring-cloud-alibaba 核心这里就两个（还有些商用组件）
  3.1：nacos，主要功能有服务注册与发现、配置管理，当然还有很多功能。这已经集成了zookeeper和config这两大功能
  3.2:sentinel，分布式系统的流量防卫兵，主要是服务的熔断降级，还有其他功能。这替换了netflix的hystrix。
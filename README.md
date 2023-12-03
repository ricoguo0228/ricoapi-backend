# RBI AIGC平台
项目介绍：从 0 开始自主搭建的 API 开放平台，该平台面向开发者开放，开发者可以提供自己设计的 API ，也可以使用平台提供的 SDK（包括一套密钥 AK/SK ）调用其他开发者的 API

技术选型：React（使用Ant Design Pro进行快捷开发），SpringBoot，Spring Cloud GateWay，Dubbo，MySQL，MyBatisPlus

主要工作：

1.基于 MyBatis Plus 框架的 QueryWrapper 实现对 MySQL 数据库的灵活查询，⾃动⽣成后端 CRUD 基础代码，减少重复⼯作。

2.基于 Spring Boot Starter 开发了客户端 SDK，对所有使用平台的开发者开放，解决开发者调⽤过程复杂、调用成本高的问题，提⾼开发体验。

3.基于 SHA256 加密算法设计 API 签名认证算法，生成唯一 AK/SK 以实现对调用者身份的鉴权，保障调⽤的安全性、可溯源性，防⽌接⼝被恶意调⽤。

4.选⽤ Spring Cloud Gateway 作为 API ⽹关，实现了路由转发、访问控制、流量染⾊，并集中处理签名校验、请求参数校验、接⼝调⽤统计等业务逻辑，提⾼安全性的同时、便于系统开发维护。

5.使⽤ Dubbo RPC 框架将模型层和业务层中参数校验相关代码抽象为公共模块，实现 GateWay 与后端之间的⾼性能接⼝调⽤，减少重复代码的书写。

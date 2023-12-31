# 开发者民工乐园
## 前端项目地址：https://github.com/ricoguo0228/ricoapi-frontend

项目介绍：从 0 开始自主搭建的 API 开放平台，该平台面向开发者开放，开发者可以提供自己设计的 API ，也可以使用平台提供的 SDK（包括一套密钥 AK/SK ）调用其他开发者的 API

技术选型：React（使用Ant Design Pro进行快捷开发），SpringBoot，Spring Cloud GateWay，Dubbo，MySQL，MyBatisPlus

### 隐私信息已抹除！

核心业务：

1.浏览 API 列表，查看 API 的详细信息并且尝试在线调用。

2.获取自己的密钥，使用 SDK 搭配密钥来调用各式各样的 API。

3.管理 API 发布，修改 API 服务状态（仅管理员可用）。

### Todo：

考虑引入缓存方案，解决高并发状态下 API 静态信息的获取请求太多的问题，首选 Redis，还要考虑 Redis 与 MySQL 之间的数据一致性问题

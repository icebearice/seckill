# seckill
## 基于SpringBoot的秒杀商品项目
项目描述：基于Java开发，实现用户登陆、查看商品详情、秒杀商品，针对秒杀高并发进行性能优化
技术栈: Java/Spring/Mybatis/SpringBoot/JMeter/Nginx/MySQL/Redis/RocketMQ
1.	采用SpringBoot	框架，整合MyBatis，以XML定义类与注解属性注入的方式进行开发
2.	将项目打包到服务器上，通过Jmeter发现单机并发瓶颈，进行相关优化
3.	采用Nginx进行反向代理，实现动静分离的服务部署
4.	采用Token分布式会话管理机制，解决登录态一致性的问题
5.	采用Redis、Guava Cache、Lua实现多级缓存削峰，并设置不同的失效策略
6.	采用RocketMQ实现缓存库存，并解决了缓存与数据库分布式提交过程不一致的风险

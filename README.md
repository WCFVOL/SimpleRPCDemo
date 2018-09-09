# RPC

## 原理

- 通过 ZooKeeper 实现服务注册与发现
- Spring实现Ioc
- Netty 异步通信
- PB格式序列化对象
- 负载均衡采用随机分配
## Server

- @RPCService 用来注解一个要被注册的Server
- 参数包括value和version

##Client

- 通过context获取RPCProxy
- RPCProxy.create() 创建代理对象

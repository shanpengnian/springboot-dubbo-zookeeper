# 使用说明 - window10

### 下载zookeeper、commons-daemon-1.0.10-bin-windows 
- https://www.aliyundrive.com/s/G8qY1q1vd4n
- 这边省略一些配置文件的修改，后续标准~
- 进入bin文件，双击install.bat，将zookeeper注册为系统服务，并在服务服务中启动


### 下载zookeeper客户端连接工具prettyZoo
- https://www.aliyundrive.com/s/RS1xXkg3GQ9
- 启动客户端，输入本机IP，端口2181


### 启动该服务
- 依次启动：提供者服务DubboProviderApplication、消费者服务DubboConsumerApplication
- 查看prettyZoo，会实时生成对应的dubbo提供者和消费者信息
- 使用浏览器或者postman访问: http://localhost:8080/dubbo/sayHello?name=lian
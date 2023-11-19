![](img/811c19f709d6de610764c138b97c07a2.jpg)
![](img/98faefa3df9372406ff0a0493667bc1e.jpg)

过滤器(Filter)----实际处理业务的节点

过滤链(FilterChain)----串联过滤器的链条


适用场景

例如常见的web请求场景

![](img/609d7e564f433b2086f9c7a2b317d0ab.png)

hsf的filter机制，服务端扩展的ServerFilter和客户端扩展的ClientFilter；
![](img/bebed77a665e9c9e97f3824c4d8dbb2e.png)

开发过java web的小伙伴都知道的servlet，servlet的入口即是FilterChain、Filter；
键值对数据库
最常用的缓存数据库，常用于存储用户登录token、临时数据、定时相关数据等。

服务器配置：https://juejin.im/post/5a290d5af265da4304068425

redis客户端查看,没有任何key
```redis
192.168.187.11:6379> keys *
(empty list or set)
```


启动
cd /var/spool/mail/root
redis-server /etc/redis.conf
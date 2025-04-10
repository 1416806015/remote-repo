### 关键排查命令总结

| 命令                                               | 作用       |
| ------------------------------------------------ | -------- |
| `journalctl -u redis -xe`                        | 查看完整错误日志 |
| `sudo -u redis redis-server /path/to/redis.conf` | 手动测试启动   |
| `ls -l /usr/local/src/redis-6.2.14/`             | 检查文件权限   |
| `netstat -tulnp \| grep 6379`                    | 检查端口占用   |

# Redis 命令行客户端

```shell
redis-cli [options] [commonds]
```

其中常见的options有：

- `-h 127.0.0.1`：指定要连接的redis节点的IP地址，默认是127.0.0.1
- `-p 6379`：指定要连接的redis节点的端口，默认是6379
- `-a 123321`：指定redis的访问密码

其中的commonds就是Redis的操作命令，例如：

- `ping`：与redis服务端做心跳测试，服务端正常会返回`pong`

不指定commond时，会进入`redis-cli`的交互控制台：

![](docs/assets/rs1.png)

# Redis 通用命令

- **KYES**：查看符合模板的所有key，不建议子啊生产环境设备上使用。

- **DEL**：删除一个指定的key。

- **EXISTS**：判断key是否存在

- **EXPIRE**：给一个key设置有效期，有效期到期时该key会被自动删除。

通过 **help [command]**  可以查看一个命令的具体用法。

```shell
127.0.0.1:6379> help EXISTS
  EXISTS key [key ...]
  summary: Determine if a key exists
  since: 1.0.0
  group: generic
```

# Redis 数据结构

![](docs/assets/rs2.png)

[reids命令](https://redis.io/commands)

# Redis String 类型操作命令

## 基本类型

### String

● ​**​SET​**​：添加或者修改已经存在的一个String类型的键值对

● ​**​GET​**​：根据key获取String类型的value

● ​**​MSET​**​：批量添加多个String类型的键值对

● ​**​MGET​**​：根据多个key获取多个String类型的value

● ​**​INCR​**​：让一个整型的key自增1

● ​**​INCRBY​**​：让一个整型的key自增并指定步长，例如：`INCRBY num 2` 让num值自增2

● ​**​INCRBYFLOAT​**​：让一个浮点类型的数字自增并指定步长

● ​**​SETNX​**​：添加一个String类型的键值对，前提是这个key不存在，否则不执行

● ​**​SETEX​**​:添加一个String类型的键值对，并且指定有效期

**Redis**的**key**的格式：**[项目名]:[业务名]:[类型]:id**    

```shell
set heima:product:1 '{"id":1, "name":"小米11", "price": 4999}'
```

### Hash

# Redis Hash 类型操作命令

● ​**​HSET key field value​**​：添加或者修改hash类型key的field的值

● ​**​HGET key field​**​：获取一个hash类型key的field的值

● ​**​HMSET​**​：批量添加多个hash类型key的field的值

● ​**​HMGET​**​ ：批量获取多个hash类型key的field的值

● ​**​HGETALL​**​：获取一个hash类型的key中的所有的field和value

● ​**​HKEYS​**​：获取一个hash类型的key中的所有的field

● ​**​HVALS​**​：获取一个hash类型的key中的所有的value

● ​**​HINCRBY​**​：让一个hash类型key的字段值自增并指定步长

● ​**​HSETNX​**​：添加一个hash类型的key的field值，前提是这个field不存在，否则不执行

### List

# Redis 列表(List)操作命令

● ​**​LPUSH key element [element...]​**​：向列表左侧插入一个或多个元素

● ​**​LPOP key​**​：移除并返回列表左侧的第一个元素，没有则返回nil

● ​**​RPUSH key element [element...]​**​ ：向列表右侧插入一个或多个元素

● ​**​RPOP key​**​：移除并返回列表右侧的第一个元素

● ​**​LRANGE key start end​**​：返回指定索引范围内的所有元素  
（start和end为索引下标，0表示第一个元素，-1表示最后一个元素）

● ​**​BLPOP key [key...] timeout​**​：阻塞式左弹出，当列表为空时等待指定秒数  
（timeout为0表示无限等待）

● ​**​BRPOP key [key...] timeout​**​：阻塞式右弹出，当列表为空时等待指定秒数

### Set

### SortedSet

## 特殊类型

### GEO

### BitMap

### HyperLog



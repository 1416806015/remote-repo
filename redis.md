### 关键排查命令总结

| 命令                                               | 作用       |
| ------------------------------------------------ | -------- |
| `journalctl -u redis -xe`                        | 查看完整错误日志 |
| `sudo -u redis redis-server /path/to/redis.conf` | 手动测试启动   |
| `ls -l /usr/local/src/redis-6.2.14/`             | 检查文件权限   |
| `netstat -tulnp \| grep 6379`                    | 检查端口占用   |



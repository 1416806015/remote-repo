package com.chen.redis_demo1;

import com.chen.redis_demo1.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(properties = {
        "spring.data.redis.host=192.168.109.150",
        "spring.data.redis.port=6379",
        "spring.data.redis.password=123456",
        "spring.data.redis.timeout=5000ms" // 添加超时配置
})
class RedisDemoApplicationTests {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    void testString() {
        // 写入一条String数据
        redisTemplate.opsForValue().set("name", "虎哥");
        // 获取string数据
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("name = " + name);
    }

    @Test
    void testSaveUser() {
        // 写入数据
        redisTemplate.opsForValue().set("user:100", new User("虎哥",21));
        User o = (User) redisTemplate.opsForValue().get("user:100");
        System.out.println("o = " + o);
    }
}
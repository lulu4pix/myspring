package com.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisConnTest {
    //使用jedis操作String 类型
    @Test
    public void testString() {
        Jedis jedis = new Jedis("192.168.53.177", 6379);
        jedis.set("alias", "lisi");
        String result = jedis.get("alias");
        System.out.println(result);
        jedis.close();
    }

    // 使用jedis操作map类型
    @Test
    public void testMap() {
        Jedis jedis = new Jedis("192.168.53.177", 6379);
        jedis.hset("user", "name", "zhangsan");
        jedis.hset("user", "age", "12");
        String name = jedis.hget("user", "name");
        String age = jedis.hget("user", "age");
        System.out.println(name + "-" + age);
        jedis.close();
    }

    // 使用连接池的jedis
    @Test
    public void testJedisPool() {
        JedisPool pool = new JedisPool("192.168.53.177", 6379);
        Jedis jedis = pool.getResource();
        jedis.hset("cat","color","yellow");
        System.out.println(jedis.hget("cat", "color"));
    }
}

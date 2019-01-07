package com.devnotes.java.redis;

import redis.clients.jedis.Jedis;

/**
 * @description: TODO
 * @title: ${file_name}
 * @package ${package_name}
 * @auther: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-01-07 14:08
 */
public class RedisClient {

    public static void main(String[] args) {
        Jedis jedis =new Jedis("localhost");
        System.out.println(jedis.ping());

        jedis.set("user_name","taony");
        System.out.println(jedis.get("user_name"));

    }
}

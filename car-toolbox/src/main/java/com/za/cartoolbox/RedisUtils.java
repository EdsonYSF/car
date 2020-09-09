/*
 * Copyright 2017 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.za.cartoolbox;

import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 类RedisUtils.java的实现描述：Redis工具类
 *
 * @author za-baopeizhou 2017年1月23日 下午3:33:43
 */
public class RedisUtils {

    @SuppressWarnings("unchecked")
    private static RedisTemplate<String, Object> redisTemplate = (RedisTemplate<String, Object>) SpringContextTool
            .getBean("redisTemplate");

    public static Long incr(String key, long delta) {
        return redisTemplate.opsForValue().increment(key, delta);
    }


    public static void put(String key, String value, int expireTime) {
        redisTemplate.opsForValue().set(key, value, expireTime, TimeUnit.SECONDS);
    }

    public static void put(String key, Object value, int expireTime) {
        redisTemplate.opsForValue().set(key, value, expireTime, TimeUnit.SECONDS);
    }

    public static void put(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public static void put(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public static String get(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }

    public static Object getValue(String key) {
        return  redisTemplate.opsForValue().get(key);
    }
    @SuppressWarnings("unchecked")
    public static <T> T get(String key, Class<T> clazz) {
        return (T) redisTemplate.opsForValue().get(key);
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> getList(String key, Class<T> clazz) {
        return (List<T>) redisTemplate.opsForValue().get(key);
    }

    public static boolean exists(String key) {
        return redisTemplate.hasKey(key);
    }

    public static void delete(String key) {
        redisTemplate.delete(key);
    }

    public static boolean setIfAbsent(String key,Object value){
        return redisTemplate.opsForValue().setIfAbsent(key,value);
    }

    public static void sendMessage(String topic,Object message){
         redisTemplate.convertAndSend(topic,message);
    }

    public static void updateExpireTime(String key, final long timeout, final TimeUnit unit){
        redisTemplate.expire(key, timeout, unit);
    }

}

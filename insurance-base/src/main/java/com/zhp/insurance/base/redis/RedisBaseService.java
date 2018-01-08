package com.zhp.insurance.base.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author zhp.dts
 * @date 2018/1/8.
 */
public class RedisBaseService {
    @Autowired
    public StringRedisTemplate stringRedisTemplate;
    @Autowired
    public RedisTemplate<Serializable, Serializable> redisTemplate;
    public Serializable get(Serializable key){
        //TODO 获取redis的key值
        try{
            return redisTemplate.opsForValue().get(key);
        }catch (Exception e){
            return null;
        }

    }
    public boolean set(Serializable key,Serializable value){
        //TODO 设置key值为value
        try{
            redisTemplate.opsForValue().set(key,value);
        }catch (Exception e){
            return false;
        }
        return true;

    }
}

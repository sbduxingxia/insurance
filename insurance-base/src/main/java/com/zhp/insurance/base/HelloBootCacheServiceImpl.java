package com.zhp.insurance.base;

import com.zhp.insurance.base.redis.RedisBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import java.io.Serializable;

/**
 * @author zhp.dts
 * @date 2018/1/4.
 */
@Service
public class HelloBootCacheServiceImpl extends RedisBaseService implements HelloBootCacheService {
    /*@Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate<Serializable, Serializable> redisTemplate;*/

    @Override
    public String setUserName(Integer id,String userName) {
        set(getUserInfoKey(id),userName);
        return userName;
    }

    @Override
    public String getUserName(Integer id) {

        Serializable obj = get(getUserInfoKey(id));
//        String strObj = stringRedisTemplate.opsForValue().get(getUserInfoKey(id));
        return obj.toString();
    }
    public String getUserInfoKey(Integer id){
        return "userInfo["+id+"]";
    }
}

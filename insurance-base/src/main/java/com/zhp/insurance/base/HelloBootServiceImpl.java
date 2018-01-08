package com.zhp.insurance.base;

import com.github.pagehelper.PageHelper;
import com.zhp.insurance.mysql.entity.UserInfo;
import com.zhp.insurance.mysql.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhp.dts
 * @date 2018/1/4.
 */
@Service
public class HelloBootServiceImpl implements HelloBootService {
    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public String helloBoot() {
        return "Hello Spring Boot";
    }

    @Cacheable(value="userName",key = "method.name+'.'+#id")
    @Override
    public String getUserName(Integer id) {
        //Dao接口调用XML的查询语句
        UserInfo userInfo = userInfoDao.selectByPrimaryKey(id);
        if(userInfo==null){
            return "";
        }
        return userInfo.getUserName();
    }


    @CachePut(value = "userInfos")
    @Override
    public List<UserInfo> queryUserList() {
        //TODO 分页查询使用Demo
        PageHelper.startPage(1,10);
        return userInfoDao.queryUserList();
    }
    @Cacheable(value="user",key = "'userInfo['+#id+']'")
    @Override
    public UserInfo getUserInfo(Integer id) {
        return userInfoDao.selectByPrimaryKey(id);
    }
}

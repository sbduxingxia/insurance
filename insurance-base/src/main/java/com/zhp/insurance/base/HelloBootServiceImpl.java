package com.zhp.insurance.base;

import com.github.pagehelper.PageHelper;
import com.zhp.insurance.mysql.entity.UserInfo;
import com.zhp.insurance.mysql.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public String getUserName(Integer id) {
        //Dao接口调用XML的查询语句
        UserInfo userInfo = userInfoDao.selectByPrimaryKey(id);
        if(userInfo==null){
            return "";
        }
        return userInfo.getUserName();
    }

    @Override
    public List<UserInfo> queryUserList() {
        //TODO 分页查询使用Demo
        PageHelper.startPage(1,1);
        return userInfoDao.queryUserList();
    }
}

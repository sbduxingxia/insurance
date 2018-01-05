package com.zhp.insurance.base;

import com.zhp.insurance.mysql.entity.UserInfo;
import com.zhp.insurance.mysql.mapper.UserInfoMapper;
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
    private UserInfoMapper userInfoMapper;
    @Override
    public String helloBoot() {
        return "Hello Spring Boot";
    }

    @Override
    public String getUserName(Integer id) {
        UserInfo userInfo = userInfoMapper.findUserById(id);
        if(userInfo==null){
            return "";
        }
        return userInfo.getUserName();
    }

    @Override
    public List<UserInfo> queryUserList() {
        return userInfoMapper.queryUserList();
    }
}

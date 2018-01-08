package com.zhp.insurance.base;

import com.zhp.insurance.mysql.entity.UserInfo;

import java.util.List;

/**
 * @author zhp.dts
 * @date 2018/1/4.
 */
public interface HelloBootService {
    String helloBoot();
    String getUserName(Integer id);
    List<UserInfo> queryUserList();
    UserInfo getUserInfo(Integer id);
}

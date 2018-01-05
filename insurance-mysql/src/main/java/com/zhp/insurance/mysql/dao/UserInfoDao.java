package com.zhp.insurance.mysql.dao;

import com.zhp.insurance.mysql.entity.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoDao extends SimpleDao<UserInfo>{
    @Select("SELECT * FROM USER_INFO WHERE ID = #{id}")
    @ResultMap(value = "BaseResultMap")
    UserInfo findUserById(Integer id);

    @Select("SELECT * FROM USER_INFO WHERE ID < 100")
    @ResultMap(value = "BaseResultMap")
    List<UserInfo> queryUserList();
}
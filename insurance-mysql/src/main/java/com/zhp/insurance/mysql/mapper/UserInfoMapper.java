package com.zhp.insurance.mysql.mapper;

import com.zhp.insurance.mysql.entity.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    @Select("SELECT * FROM USER_INFO WHERE ID = #{id}")
    @Results(id = "BaseResultMap",value ={
            @Result(column = "USER_NAME", property="userName"),
            @Result(column="USER_CODE",property="userCode"),
            @Result(column="USER_TEL",property="userTel"),
            @Result(column="USER_PWD",property="userPwd"),
            @Result(column="ACTIVE_FLAG",property="activeFlag")})
    UserInfo findUserById(Integer id);

    UserInfo selectByPrimaryKey(Integer id);
    @Select("SELECT * FROM USER_INFO WHERE ID < 100")
    @ResultMap(value = "BaseResultMap")
    List<UserInfo> queryUserList();
}
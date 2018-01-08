package com.zhp.insurance.common.contants;

/**
 * 开发常量配置
 * @author zhp.dts
 * @date 2018/1/3.
 */
public class DevConfigContants implements IConfigContants {
    protected final String baseAppName="insurance-base";
    protected final String dubboRegistAddress="127.0.0.1:12181";
    protected final Integer baseDubboPort = 20880;
    protected final String dubboRegistProtocol="zookeeper";

    protected final String jdbcUrl="jdbc:mysql://127.0.0.1:3306/test";
    protected final String jdbcUserName="root";
    protected final String jdbcUserPwd="root";

    protected final String redisAddress="127.0.0.1";
    protected final String redisPort="6379";
    protected final String redisPwd="";

    @Override
    public String getBaseAppName() {
        return baseAppName;
    }

    @Override
    public String getEvnType() {
        return "开发";
    }

    @Override
    public String getDubboRegistAddress() {
        return dubboRegistAddress;
    }

    @Override
    public Integer getBaseDubboPort() {
        return baseDubboPort;
    }

    @Override
    public String getDubboRegistProtocol() {
        return dubboRegistProtocol;
    }

    @Override
    public String getJdbcUrl() {
        return jdbcUrl;
    }

    @Override
    public String getJdbcUserName() {
        return jdbcUserName;
    }

    @Override
    public String getJdbcUserPwd() {
        return jdbcUserPwd;
    }

    @Override
    public Boolean isLogSlowSql() {
        return true;
    }

    @Override
    public String getRedisAddress() {
        return redisAddress;
    }

    @Override
    public String getRedisPort() {
        return redisPort;
    }

    @Override
    public String getRedisPassword() {
        return redisPwd;
    }
}

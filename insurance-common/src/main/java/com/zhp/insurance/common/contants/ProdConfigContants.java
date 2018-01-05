package com.zhp.insurance.common.contants;

/**
 * 生产常亮配置
 * @author zhp.dts
 * @date 2018/1/3.
 */
public class ProdConfigContants implements IConfigContants {
    @Override
    public String getBaseAppName() {
        return null;
    }

    @Override
    public String getEvnType() {
        return "生产";
    }

    @Override
    public String getDubboRegistAddress() {
        return null;
    }

    @Override
    public Integer getBaseDubboPort() {
        return null;
    }

    @Override
    public String getDubboRegistProtocol() {
        return null;
    }

    @Override
    public String getJdbcUrl() {
        return null;
    }

    @Override
    public String getJdbcUserName() {
        return null;
    }

    @Override
    public String getJdbcUserPwd() {
        return null;
    }

    @Override
    public Boolean isLogSlowSql() {
        return null;
    }
}

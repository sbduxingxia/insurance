package com.zhp.insurance.common.contants;

/**
 * @author zhp.dts
 * @date 2018/1/3.
 */
public interface IConfigContants {
    String getBaseAppName();
    String getEvnType();
    String getDubboRegistAddress();
    Integer getBaseDubboPort();
    String getDubboRegistProtocol();

    /**
     * jdbc配置
     */
    String getJdbcUrl();
    String getJdbcUserName();
    String getJdbcUserPwd();
}

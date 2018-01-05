package com.zhp.insurance.base.mybatis;

import com.zhp.insurance.common.CommonConfig;
import com.zhp.insurance.common.contants.IConfigContants;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhp.dts
 * @date 2018/1/4.
 */
@Configuration
public class DataSourceConfig {
    @Bean
    public BasicDataSource dataSource(){
        IConfigContants configContants = CommonConfig.getInstance();
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
        dataSource.setUrl(configContants.getJdbcUrl());
        dataSource.setUsername(configContants.getJdbcUserName());
        dataSource.setPassword(configContants.getJdbcUserPwd());
        dataSource.setMaxIdle(20);
        dataSource.setInitialSize(10);
        dataSource.setValidationQuery("SELECT 1 FROM DUAL");
        dataSource.setTestOnBorrow(true);
        return dataSource;
    }
}

package com.zhp.insurance.base.dubbo;

import com.alibaba.dubbo.config.spring.ServiceBean;
import com.zhp.insurance.base.HelloBootCacheService;
import com.zhp.insurance.base.HelloBootService;
import com.zhp.insurance.common.CommonConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhp.dts
 * @date 2018/1/3.
 */
@Configuration
public class DubboServerConfig extends DubboBaseConfig{

    @Bean
    public ServiceBean<HelloBootService> helloBootService(HelloBootService helloBootService){
        ServiceBean<HelloBootService> serviceConfig = new ServiceBean<HelloBootService>();
        serviceConfig.setVersion(CommonConfig.getInstance().getBaseAppName());
        serviceConfig.setInterface(HelloBootService.class);
        serviceConfig.setId(HelloBootService.class.getSimpleName());
        serviceConfig.setTimeout(6000);
        serviceConfig.setRetries(0);
        serviceConfig.setRef(helloBootService);
        return serviceConfig;
    }
    @Bean
    public ServiceBean<HelloBootCacheService> helloBootCacheService(HelloBootCacheService helloBootCacheService){
        ServiceBean<HelloBootCacheService> serviceConfig = new ServiceBean<HelloBootCacheService>();
        serviceConfig.setVersion(CommonConfig.getInstance().getBaseAppName());
        serviceConfig.setInterface(HelloBootCacheService.class);
        serviceConfig.setId(HelloBootCacheService.class.getSimpleName());
        serviceConfig.setTimeout(6000);
        serviceConfig.setRetries(0);
        serviceConfig.setRef(helloBootCacheService);
        return serviceConfig;
    }
}

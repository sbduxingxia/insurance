package com.zhp.insurance.base.dubbo;

import com.alibaba.dubbo.config.spring.ServiceBean;
import com.zhp.insurance.base.HelloBootService;
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
        serviceConfig.setVersion(contants.getBaseAppName());
        serviceConfig.setInterface(HelloBootService.class);
        serviceConfig.setTimeout(6000);
        serviceConfig.setRetries(0);
        serviceConfig.setRef(helloBootService);
        return serviceConfig;
    }
}

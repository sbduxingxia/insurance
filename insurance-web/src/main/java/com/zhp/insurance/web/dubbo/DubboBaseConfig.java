package com.zhp.insurance.web.dubbo;

import com.alibaba.dubbo.config.*;
import com.zhp.insurance.common.CommonConfig;
import com.zhp.insurance.common.contants.IConfigContants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhp.dts
 * @date 2018/1/3.
 */
@Configuration
public class DubboBaseConfig {

    public IConfigContants contants = CommonConfig.getInstance();
    @Bean
    public ApplicationConfig application(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(contants.getBaseAppName());
        return applicationConfig;
    }
    @Bean
    public RegistryConfig registry(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol(contants.getDubboRegistProtocol());
        registryConfig.setAddress(contants.getDubboRegistAddress());
        return registryConfig;
    }
    /*@Bean
    public MonitorConfig monitorConfig(){
        MonitorConfig mc = new MonitorConfig();
        mc.setProtocol("registry");
        return mc;
    }*/
   /* @Bean
    public ReferenceConfig referenceConfig(){
        ReferenceConfig rc = new ReferenceConfig();
        rc.setMonitor(monitorConfig());
        return rc;
    }*/
   /* @Bean
    public ProtocolConfig protocol(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(contants.getBaseDubboPort());
        protocolConfig.setName("dubbo");
        return protocolConfig;
    }*/
    /*@Bean
    public ProviderConfig provider(){
        ProviderConfig pc = new ProviderConfig();
        pc.setMonitor(monitorConfig());
        return pc;
    }*/

}

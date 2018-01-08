package com.zhp.insurance.web.dubbo;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.zhp.insurance.base.HelloBootService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhp.dts
 * @date 2018/1/3.
 */
@Configuration
public class DubboClientConfig extends DubboBaseConfig{
    @Bean
    public ReferenceBean<HelloBootService> helloBootServiceReference(){
        ReferenceBean<HelloBootService> ref = new ReferenceBean<HelloBootService>();
        ref.setVersion(contants.getBaseAppName());
        ref.setInterface(HelloBootService.class);
        ref.setId(HelloBootService.class.getSimpleName());
        ref.setTimeout(5000);
        ref.setRetries(3);
        ref.setCheck(false);
        return ref;
    }
}

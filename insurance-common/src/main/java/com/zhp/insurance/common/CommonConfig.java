package com.zhp.insurance.common;

import com.zhp.insurance.common.contants.DevConfigContants;
import com.zhp.insurance.common.contants.IConfigContants;
import com.zhp.insurance.common.contants.ProdConfigContants;
import com.zhp.insurance.common.contants.TestConfigContants;

/**
 * @author zhp.dts
 * @date 2018/1/3.
 */
public class CommonConfig {
    /**
     * 发版环境
     */
    private static final RunEvnEnum EVN=RunEvnEnum.DEV;
    private static IConfigContants instance;
    static {
        instance = getInstance();
    }
    public CommonConfig(){}
    public static IConfigContants getInstance(){
        if(instance==null){
            switch (CommonConfig.EVN){
                case DEV:
                    instance = new DevConfigContants();
                    break;
                case TEST:
                    instance = new TestConfigContants();
                    break;
                case PROD:
                    instance = new ProdConfigContants();
                    break;
            }
        }
        return instance;
    }

}

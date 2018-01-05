package com.zhp.insurance.common;

import com.zhp.insurance.common.contants.IConfigContants;

/**
 * @author zhp.dts
 * @date 2018/1/4.
 */
public class CommonConfigTest extends BaseTest {
    public static void main(String [] args){
        IConfigContants iConfigContants = CommonConfig.getInstance();
        System.out.println(iConfigContants.getEvnType());
    }
}

package com.zhp.insurance.common;

/**
 * @author zhp.dts
 * @date 2018/1/3.
 */
public enum RunEvnEnum {
    DEV("dev","开发"),
    TEST("test","测试"),
    PROD("prod","生产");
    String key;
    String name;
    RunEvnEnum(String key,String name){
        setKey(key);
        setName(name);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

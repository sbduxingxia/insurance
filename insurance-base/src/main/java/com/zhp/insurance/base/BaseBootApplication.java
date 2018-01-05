package com.zhp.insurance.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhp.dts
 * @date 2018/1/3.
 */
@SpringBootApplication
public class BaseBootApplication {
    public static void main(String[] args){
        SpringApplication.run(BaseBootApplication.class,args);
        int beginIndex=0;
        while(true){
            beginIndex++;
            System.out.println(System.currentTimeMillis()+":heartbeat = "+beginIndex);
            try {
                Thread.sleep(60*60*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

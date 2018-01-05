package com.zhp.insurance.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebBootApplication.class, args);
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

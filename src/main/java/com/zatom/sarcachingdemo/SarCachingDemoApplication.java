package com.zatom.sarcachingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SarCachingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SarCachingDemoApplication.class, args);
	}

}

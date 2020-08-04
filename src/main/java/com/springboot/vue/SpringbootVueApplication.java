package com.springboot.vue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.springboot.vue.mapper")
public class SpringbootVueApplication {

	public static void main(String[] args) {
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootVueApplication.class);
//        builder.application().setAdditionalProfiles("dev");
//        builder.run(args);
		SpringApplication.run(SpringbootVueApplication.class, args);
	}


}

package com.springboot.vue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootVueApplication {

	public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootVueApplication.class);
        builder.application().setAdditionalProfiles("dev");
        builder.run(args);
//		SpringApplication.run(SpringbootVueApplication.class, args);
	}

}

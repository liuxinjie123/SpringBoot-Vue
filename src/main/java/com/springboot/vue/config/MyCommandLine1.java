package com.springboot.vue.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class MyCommandLine1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(" command line 1 ");
    }
}

package com.springboot.vue.common;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "book")
@Data
@NoArgsConstructor
public class ThreeBodyBook {
    private String name;
    private String author;
    private double price;
}

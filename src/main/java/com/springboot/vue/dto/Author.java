package com.springboot.vue.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Author implements Serializable {
    /**
     * name
     */
    private String name;
    /**
     * mobile phone
     */
    private String mobile;

}

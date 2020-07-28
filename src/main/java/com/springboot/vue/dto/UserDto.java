package com.springboot.vue.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * name
     */
    private String name;

    /**
     * phone
     */
    private String phone;

    /**
     * sex
     * 0-男， 1-女
     */
    private int sex;

    public UserDto() {}

    public UserDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

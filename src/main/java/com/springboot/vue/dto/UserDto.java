package com.springboot.vue.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.springboot.vue.config.JsonLongSerializer;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    /**
     * id
     */
    @JsonSerialize(using = JsonLongSerializer.class)
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

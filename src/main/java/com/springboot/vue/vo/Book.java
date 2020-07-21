package com.springboot.vue.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {
    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    /**
     * author
     */
    private String author;
}

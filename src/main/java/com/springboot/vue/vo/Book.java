package com.springboot.vue.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

    /**
     * publish date
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime publishDate;

    /**
     * price
     */
    protected BigDecimal price;

    public Book(String code, String name, String author, LocalDateTime publishDate) {
        this.code = code;
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }
}

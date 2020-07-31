package com.springboot.vue.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class BookEntity implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * name
     */
    private String name;

    /**
     * author
     */
    private String author;

    /**
     * creaetTime
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

}

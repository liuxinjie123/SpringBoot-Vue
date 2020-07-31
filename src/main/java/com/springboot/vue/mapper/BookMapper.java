package com.springboot.vue.mapper;

import com.springboot.vue.entity.BookEntity;

import java.util.List;

public interface BookMapper {
    int add(BookEntity book);

    int deleteById(Long id);

    int updateById(BookEntity book);

    BookEntity findById(Long id);

    List<BookEntity> findAll();
}

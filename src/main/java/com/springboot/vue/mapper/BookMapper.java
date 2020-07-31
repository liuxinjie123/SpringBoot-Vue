package com.springboot.vue.mapper;

import com.springboot.vue.entity.BookEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int add(BookEntity book);

    int deleteById(Long id);

    int updateById(BookEntity book);

    BookEntity findById(Long id);

    List<BookEntity> findAll();
}

package com.springboot.vue.service.api;

import com.springboot.vue.entity.BookEntity;

import java.util.List;

public interface BookService {

    int save(BookEntity book);

    BookEntity findById(Long id);

    List<BookEntity> findAll();
}

package com.springboot.vue.service.impl;

import com.springboot.vue.entity.BookEntity;
import com.springboot.vue.repository.BookRepository;
import com.springboot.vue.service.api.BookJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookJpaServiceImpl implements BookJpaService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public BookEntity findById(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }
}

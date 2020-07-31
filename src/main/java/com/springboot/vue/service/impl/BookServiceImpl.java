package com.springboot.vue.service.impl;

import com.springboot.vue.dao.BookDao;
import com.springboot.vue.entity.BookEntity;
import com.springboot.vue.service.api.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public int save(BookEntity book) {
        return bookDao.addBook(book);
    }

    @Override
    public BookEntity findById(Long id) {
        return bookDao.findById(id);
    }

    @Override
    public List<BookEntity> findAll() {
        return bookDao.findAll();
    }
}

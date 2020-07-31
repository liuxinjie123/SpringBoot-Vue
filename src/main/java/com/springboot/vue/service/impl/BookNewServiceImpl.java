package com.springboot.vue.service.impl;

import com.springboot.vue.entity.BookEntity;
import com.springboot.vue.mapper.BookMapper;
import com.springboot.vue.service.api.BookNewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookNewServiceImpl implements BookNewService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public int add(BookEntity book) {
        return bookMapper.add(book);
    }

    @Override
    public int deleteById(Long id) {
        return bookMapper.deleteById(id);
    }

    @Override
    public int updateById(BookEntity book) {
        return bookMapper.updateById(book);
    }

    @Override
    public BookEntity findById(Long id) {
        return bookMapper.findById(id);
    }

    @Override
    public List<BookEntity> findAll() {
        return bookMapper.findAll();
    }
}

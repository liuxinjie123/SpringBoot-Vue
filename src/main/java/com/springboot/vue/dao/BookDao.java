package com.springboot.vue.dao;

import com.springboot.vue.entity.BookEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class BookDao {
    @Resource(name = "jdbcTemplateOne")
    JdbcTemplate jdbcTemplateOne;

    public int addBook(BookEntity book) {
        return jdbcTemplateOne.update("INSERT INTO book(name, author, create_time) VALUES(?, ?, now())",
                book.getName(), book.getAuthor());
    }

    public BookEntity findById(Long id) {
        return jdbcTemplateOne.queryForObject("SELECT * FROM book where id=?",
                new BeanPropertyRowMapper<>(BookEntity.class), id);
    }

    public List<BookEntity> findAll() {
        return jdbcTemplateOne.query("SELECT * FROM book ORDER BY create_time DESC",
                new BeanPropertyRowMapper<>(BookEntity.class));
    }
}

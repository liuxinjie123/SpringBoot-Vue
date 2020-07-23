package com.springboot.vue.controller.data;

import com.alibaba.fastjson.JSON;
import com.springboot.vue.common.Result;
import com.springboot.vue.common.ThreeBodyBook;
import com.springboot.vue.dto.Author;
import com.springboot.vue.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    ThreeBodyBook threeBodyBook;

    @GetMapping
    public Result getBook() {
        return Result.success(threeBodyBook.toString());
    }

    @GetMapping("/2")
    public Result getBook2() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("ISBN-1001-001", "三国演义", "罗贯中", LocalDateTime.now(), BigDecimal.valueOf(100.0)));
        bookList.add(new Book("ISBN-2001-001", "平凡的世界", "路遥", LocalDateTime.now(), BigDecimal.valueOf(100.0)));
        bookList.add(new Book("ISBN-2006-001", "三体", "刘慈欣", LocalDateTime.now(), BigDecimal.valueOf(100.0)));
        return Result.success(bookList);
    }

    @GetMapping("/initBinder")
    public Result testInitBinder(@ModelAttribute("b")com.springboot.vue.dto.Book book, @ModelAttribute("a")Author author) {
        return Result.success(JSON.toJSONString(book) + JSON.toJSONString(author));
    }
}

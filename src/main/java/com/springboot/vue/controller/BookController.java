package com.springboot.vue.controller;

import com.springboot.vue.common.ThreeBodyBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    ThreeBodyBook threeBodyBook;

    @GetMapping
    public String getBook() {
        return threeBodyBook.toString();
    }
}

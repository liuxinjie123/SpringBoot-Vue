package com.springboot.vue.controller.page;

import com.springboot.vue.common.ListData;
import com.springboot.vue.vo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BookPageController {

    @GetMapping("/books")
    public ModelAndView booksPage() {
        ListData data = new ListData();
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("ISBN-1001-001", "三国演义", "罗贯中"));
        bookList.add(new Book("ISBN-2001-001", "平凡的世界", "路遥"));
        bookList.add(new Book("ISBN-2006-001", "三体", "刘慈欣"));
        List<String> header = Arrays.asList("序号", "编号", "名称", "作者");
        data.setHeader(header);
        List<String> keyList = Arrays.asList("code", "name", "author");
        data.setKeyList(keyList);
        data.setList(bookList);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", data);
        modelAndView.setViewName("books");
        return modelAndView;
    }
}

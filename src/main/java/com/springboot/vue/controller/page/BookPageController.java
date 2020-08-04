package com.springboot.vue.controller.page;

import com.springboot.vue.common.ListData;
import com.springboot.vue.entity.BookEntity;
import com.springboot.vue.service.api.BookJpaService;
import com.springboot.vue.service.api.BookNewService;
import com.springboot.vue.service.api.BookService;
import com.springboot.vue.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller("BookPageController")
public class BookPageController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookNewService bookNewService;
    @Autowired
    private BookJpaService bookJpaService;

    @GetMapping("/book")
    public ModelAndView booksPage() {
        ListData data = new ListData();
        data.setTitle("图书列表");
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("ISBN-1001-001", "三国演义", "罗贯中", LocalDateTime.now(), BigDecimal.valueOf(100.0)));
        bookList.add(new Book("ISBN-2001-001", "平凡的世界", "路遥", LocalDateTime.now(), BigDecimal.valueOf(100.0)));
        bookList.add(new Book("ISBN-2006-001", "三体", "刘慈欣", LocalDateTime.now(), BigDecimal.valueOf(100.0)));
        List<String> header = Arrays.asList("序号", "编号", "名称", "作者", "出版时间");
        data.setHeader(header);
        List<String> keyList = Arrays.asList("code", "name", "author", "publishDate");
        data.setKeyList(keyList);
        data.setList(bookList);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", data);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @GetMapping("/book/1")
    public ModelAndView bookListPage() {
        ListData data = new ListData();
        data.setTitle("图书列表");
        List<BookEntity> bookList = bookService.findAll();
        List<String> header = Arrays.asList("序号", "名称", "作者", "创建时间");
        data.setHeader(header);
        List<String> keyList = Arrays.asList("name", "author", "createTime");
        data.setKeyList(keyList);
        data.setList(bookList);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", data);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @GetMapping("/book/2")
    public ModelAndView bookListPage2() {
        ListData data = new ListData();
        data.setTitle("图书列表");
        List<BookEntity> bookList = bookNewService.findAll();
        List<String> header = Arrays.asList("序号", "名称2", "作者", "创建时间");
        data.setHeader(header);
        List<String> keyList = Arrays.asList("name", "author", "createTime");
        data.setKeyList(keyList);
        data.setList(bookList);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", data);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @GetMapping("/book/3")
    public ModelAndView bookListPage3() {
        ListData data = new ListData();
        data.setTitle("图书列表");
        List<BookEntity> bookList = bookJpaService.findAll();
        List<String> header = Arrays.asList("序号", "名称3", "作者", "创建时间");
        data.setHeader(header);
        List<String> keyList = Arrays.asList("name", "author", "createTime");
        data.setKeyList(keyList);
        data.setList(bookList);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", data);
        modelAndView.setViewName("list");
        return modelAndView;
    }

}

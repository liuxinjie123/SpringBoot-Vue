package com.springboot.vue.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalDataConfig {


    @ModelAttribute(name = "token")
    public Map mydata() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "123456");
        return map;
    }


    @InitBinder("a")
    public void inita(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }

    @InitBinder("b")
    public void initb(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }

}

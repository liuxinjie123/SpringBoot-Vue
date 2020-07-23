package com.springboot.vue.controller.data;

import com.springboot.vue.common.Result;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello SpringBoot-Vue";
    }

    @GetMapping(value = "/model")
    public Result modelTest(Model model) {
        model.asMap();
        model.addAttribute("name", "liuxinjie");
        return Result.success(model);
    }

}

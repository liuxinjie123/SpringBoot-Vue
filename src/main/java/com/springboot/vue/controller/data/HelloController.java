package com.springboot.vue.controller.data;

import com.springboot.vue.common.Result;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/hello")
    @CrossOrigin(value = "http://localhost:8006", maxAge = 100, allowedHeaders = "*")
    public String hello() {
        return "Hello SpringBoot-Vue";
    }

    @GetMapping(value = "/model")
    public Result modelTest(Model model) {
        model.asMap();
        model.addAttribute("name", "liuxinjie");
        return Result.success(model);
    }

    @PostMapping
    public Result testPost(String name) {
        return Result.success(name);
    }

    @DeleteMapping(value = "/66")
    public Result testDelete() {
        return Result.success();
    }

}

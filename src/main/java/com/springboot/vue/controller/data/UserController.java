package com.springboot.vue.controller.data;

import com.springboot.vue.common.Result;
import com.springboot.vue.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public Result findById(@PathVariable(value = "id") Long id) {
        return Result.success(userService.findById(id));
    }

}

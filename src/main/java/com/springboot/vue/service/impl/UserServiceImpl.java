package com.springboot.vue.service.impl;

import com.springboot.vue.dto.UserDto;
import com.springboot.vue.service.api.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDto findById(Long id) {
        return new UserDto(id, "2020");
    }
}

package com.springboot.vue.service.api;

import com.springboot.vue.dto.UserDto;

public interface UserService {

    UserDto findById(Long id);
}

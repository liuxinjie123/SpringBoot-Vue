package com.springboot.vue.config;

import com.springboot.vue.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = MaxUploadSizeExceededException.class)
    public Result maxUploadSizeExceededException() {
        return Result.error("the size of file uploaded has exceeded");
    }
}

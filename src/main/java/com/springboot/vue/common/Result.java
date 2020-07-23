package com.springboot.vue.common;

import com.alibaba.fastjson.JSON;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
public class Result<T> implements Serializable {
    private static final String CODE_SUCCESS = "0";
    private static final String MSG_SUCCESS = "请求成功";

    private static final String CODE_ERROR = "1";
    private static final String MSG_ERROR = "请求异常";

    public String code;
    public String msg;
    public T data;

    private boolean isSuccess;

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(String code, String msg, T data) {
        this(code, msg);
        this.data = data;
    }

    public boolean isSuccess() {
        return this.code.equals(CODE_SUCCESS);
    }

    public static Result success() {
        return new Result(CODE_SUCCESS, MSG_SUCCESS);
    }

    public static Result error() {
        return new Result(CODE_ERROR, MSG_ERROR);
    }

    public static Result error(String msg) {
        return new Result(CODE_ERROR, msg);
    }

    public static Result success(Object data) {
        return new Result(CODE_SUCCESS, MSG_SUCCESS, JSON.toJSONString(data));
    }


}

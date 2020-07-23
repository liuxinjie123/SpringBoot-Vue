package com.springboot.vue.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println(" preHandler ... ");
        System.out.println(request.getMethod());
        System.out.println(request.getRequestURL());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println(" postHandle ... ");
        System.out.println(request.getMethod());
        System.out.println(response.getHeaderNames());
        System.out.println(response.getTrailerFields());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println(" after completion ... ");
    }
}

package com.springboot.vue.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.springboot.vue.service.impl.*.*(..))")
    public void pc1() {
        System.out.println(" --- pc1 --- ");
    }

    @Before(value = "pc1()")
    public void before(JoinPoint point) {
        String name = point.getSignature().getName();
        System.out.println(name + " is start to execute.");
    }

    @After(value = "pc1()")
    public void after(JoinPoint point) {
        String name = point.getSignature().getName();
        System.out.println(name + " executed completely.");
    }

    @AfterReturning(value = "pc1()", returning = "result")
    public void afterReturning(JoinPoint point, Object result) {
        String name = point.getSignature().getName();
        System.out.println(" the return result of " + name + " is " + result);
    }

    @AfterThrowing(value = "pc1()", throwing = "e")
    public void afterThrowing(JoinPoint point, Exception e) {
        String name = point.getSignature().getName();
        System.out.println(" the exception of " + name + " is " + e.getMessage());
    }

    @Around(value = "pc1()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        return point.proceed();
    }

}

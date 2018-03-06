package com.zkn.spring.learn.aop.spring.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2018/2/19.
 */
@Aspect
@Component
public class SpringAopConfig {

    @Pointcut("execution(* com.zkn.spring.learn.aop.spring.service..*.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void beforeAdvice() {
        System.out.println("SpingAOP前置通知开始。。。。");
    }
}

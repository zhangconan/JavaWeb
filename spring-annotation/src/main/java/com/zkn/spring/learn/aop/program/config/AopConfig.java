package com.zkn.spring.learn.aop.program.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by zkn on 2017/10/7.
 */
@Aspect
public class AopConfig {

    @Pointcut("execution(* com.zkn.spring.learn.aop.program.service..*.*(..))")
    public void servicePointcut() {

    }

    @Before("servicePointcut()")
    public void beforePointcut() {
        System.out.println("我是第二个前置通知。。。。");
    }
}

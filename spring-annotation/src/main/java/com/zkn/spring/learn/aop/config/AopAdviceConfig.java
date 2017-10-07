package com.zkn.spring.learn.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by zkn on 2017/10/7.
 */
@Aspect
public class AopAdviceConfig {

    @Before("execution(* com.zkn.spring.learn.aop.service..*.*(..))")
    public void beforeAdvice(){
        System.out.println("我是前置通知....");
    }
}

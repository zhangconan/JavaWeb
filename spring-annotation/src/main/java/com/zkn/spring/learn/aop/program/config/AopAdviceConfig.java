package com.zkn.spring.learn.aop.program.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author zkn
 * @date 2017/10/7
 */
@Aspect
public class AopAdviceConfig {

    @Before("execution(* com.zkn.spring.learn.aop.program.service..*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println(joinPoint.getThis());
        System.out.println("我是前置通知....");
    }
}

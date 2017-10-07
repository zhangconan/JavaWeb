package com.zkn.spring.learn.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by zkn on 2017/10/7.
 */
@Aspect
public class AopConfig {

    @Pointcut("execution(* com.zkn.spring.learn.aop.service..*.*(..))")
    public void servicePointcut() {

    }

}

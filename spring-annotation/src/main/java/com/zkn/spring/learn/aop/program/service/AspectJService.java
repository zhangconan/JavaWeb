package com.zkn.spring.learn.aop.program.service;

/**
 * Created by zkn on 2017/10/7.
 */
public interface AspectJService {

    /**
     * 测试前置通知
     */
    void beforeAdvice();

    /**
     * 测试后置通知
     */
    void afterAdvice();
}

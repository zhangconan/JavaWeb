package com.zkn.spring.learn.aop.program.service.impl;

import com.zkn.spring.learn.aop.program.service.AspectJService;

/**
 * @author zkn
 * @date 2017/10/7
 */
public class AspectJServiceImpl implements AspectJService {

    @Override
    public void beforeAdvice() {
        System.out.println("测试前置通知，我是第一个Service。。。。。。");
    }

    /**
     * 测试后置通知
     */
    @Override
    public void afterAdvice() {
        System.out.println("测试AspectJ后置通知。。。。");
    }

    /**
     * 后置返回通知
     *
     * @return
     */
    @Override
    public String afterReturnAdvice() {
        System.out.println("测试后置返回通知类型!");
        return "后置返回通知被调用了!!!";
    }
}

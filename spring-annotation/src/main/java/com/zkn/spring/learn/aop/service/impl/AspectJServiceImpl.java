package com.zkn.spring.learn.aop.service.impl;

import com.zkn.spring.learn.aop.service.AspectJService;

/**
 * Created by zkn on 2017/10/7.
 */
public class AspectJServiceImpl implements AspectJService {

    @Override
    public void beforeAdvice() {
        System.out.println("测试被AspectJ拦截。。。。。。");
    }
}

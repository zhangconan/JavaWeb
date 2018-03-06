package com.zkn.spring.learn.aop.spring.service.impl;

import com.zkn.spring.learn.aop.spring.service.SpringAopService;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2018/2/19.
 */
@Service
public class SpringAopServiceImpl implements SpringAopService {

    /**
     * 前置通知
     */
    @Override
    public void testBeforeAdvice() {
        System.out.println("这是SpringAOP前置通知。。。。");
    }
}

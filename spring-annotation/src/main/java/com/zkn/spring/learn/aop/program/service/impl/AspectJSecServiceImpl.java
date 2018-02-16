package com.zkn.spring.learn.aop.program.service.impl;

import com.zkn.spring.learn.aop.program.service.AspectJSecService;

/**
 * @author zkn
 * @date 2018/2/12
 */
public class AspectJSecServiceImpl implements AspectJSecService {

    @Override
    public void testBeforeService() {
        System.out.println("测试前置通知，我是第二个Service。。。。。。");
    }
}

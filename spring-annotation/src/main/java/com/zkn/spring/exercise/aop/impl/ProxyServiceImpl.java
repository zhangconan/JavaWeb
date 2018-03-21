package com.zkn.spring.exercise.aop.impl;

import com.zkn.spring.exercise.aop.ProxyService;

/**
 * @author zkn
 * @date 2018/3/18
 */
public class ProxyServiceImpl implements ProxyService {

    /**
     * 测试方法
     */
    @Override
    public void testProxy() {
        System.out.println("我是ProxyService中的测试方法......");
    }
}

package com.zkn.spring.learn.service.impl;

import com.zkn.spring.learn.service.FactoryBeanService;

/**
 * @author zkn
 * @date 2018/3/15
 */
public class FactoryBeanServiceImpl implements FactoryBeanService {
    /**
     * 测试FactoryBean
     */
    @Override
    public void testFactoryBean() {
        System.out.println("我是FactoryBean的一个测试类。。。。");
    }
}

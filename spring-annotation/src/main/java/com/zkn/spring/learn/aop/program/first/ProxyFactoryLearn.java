package com.zkn.spring.learn.aop.program.first;

import com.zkn.spring.learn.aop.program.config.CustomBeforeAdvice;
import com.zkn.spring.learn.aop.program.service.AspectJService;
import com.zkn.spring.learn.aop.program.service.impl.AspectJServiceImpl;
import org.springframework.aop.framework.ProxyFactory;

/**
 * 用来测试ProxyFactory 不使用AspectJ注解
 *
 * @author zkn
 * @Date 2017-10-11
 */
public class ProxyFactoryLearn {

    public static void main(String[] args) {

        AspectJService aspectJService = new AspectJServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.addInterface(AspectJService.class);
        proxyFactory.addAdvice(new CustomBeforeAdvice());
        proxyFactory.setTarget(aspectJService);

        AspectJService proxy = (AspectJService) proxyFactory.getProxy();
        proxy.beforeAdvice();
    }
}

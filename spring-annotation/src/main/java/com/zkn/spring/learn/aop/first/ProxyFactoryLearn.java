package com.zkn.spring.learn.aop.first;

import com.zkn.spring.learn.aop.config.CustomBeforeAdvice;
import com.zkn.spring.learn.aop.service.AspectJService;
import com.zkn.spring.learn.aop.service.impl.AspectJServiceImpl;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author zkn
 * @Date 2017-10-11
 */
public class ProxyFactoryLearn {

    public static void main(String[] args){

        AspectJService aspectJService = new AspectJServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.addInterface(AspectJService.class);
        proxyFactory.addAdvice(new CustomBeforeAdvice());
        proxyFactory.setTarget(aspectJService);

        AspectJService proxy = (AspectJService) proxyFactory.getProxy();
        proxy.beforeAdvice();
    }
}

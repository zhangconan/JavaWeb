package com.zkn.spring.learn.aop.first;

import com.zkn.spring.learn.aop.config.AopAdviceConfig;
import com.zkn.spring.learn.aop.service.AspectJService;
import com.zkn.spring.learn.aop.service.impl.AspectJServiceImpl;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * Created by zkn on 2017/10/7.
 */
public class AspectJProxyFactoryLearn {

    public static void main(String[] args){
        AspectJService aspectJService = new AspectJServiceImpl();
        AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory(aspectJService);
        aspectJProxyFactory.addInterface(AspectJService.class);
        aspectJProxyFactory.addAspect(AopAdviceConfig.class);

        AspectJService proxyService = aspectJProxyFactory.getProxy();
        proxyService.beforeAdvice();
    }
}

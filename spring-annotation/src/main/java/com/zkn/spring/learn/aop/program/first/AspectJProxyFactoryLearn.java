package com.zkn.spring.learn.aop.program.first;

import com.zkn.spring.learn.aop.program.config.AopAdviceConfig;
import com.zkn.spring.learn.aop.program.config.AopConfig;
import com.zkn.spring.learn.aop.program.service.AspectJService;
import com.zkn.spring.learn.aop.program.service.impl.AspectJServiceImpl;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * 用编程的方式进行AOP拦截
 * 用来测试只有一个Service
 *
 * @author zkn
 * @date 2017/10/7
 */
public class AspectJProxyFactoryLearn {

    public static void main(String[] args) {
        AspectJService aspectJService = new AspectJServiceImpl();
        //在AspectJProxyFactory的这个构造函数中就会将类的所有接口，添加到AspectJProxyFactory中
        AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory(aspectJService);
        aspectJProxyFactory.addAspect(AopAdviceConfig.class);
        aspectJProxyFactory.addAspect(AopConfig.class);

        AspectJService proxyService = aspectJProxyFactory.getProxy();
        proxyService.beforeAdvice();
    }
}

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
        //手工创建一个实例
        AspectJService aspectJService = new AspectJServiceImpl();
        //使用AspectJ语法 自动创建代理对象
        AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory(aspectJService);
        //添加切面和通知类
        aspectJProxyFactory.addAspect(AopAdviceConfig.class);
        //创建代理对象
        AspectJService proxyService = aspectJProxyFactory.getProxy();
        //进行方法调用
        proxyService.beforeAdvice();

        proxyService.afterAdvice();

        proxyService.afterReturnAdvice();
    }
}

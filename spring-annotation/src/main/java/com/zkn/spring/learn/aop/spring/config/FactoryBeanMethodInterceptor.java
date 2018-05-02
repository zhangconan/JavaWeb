package com.zkn.spring.learn.aop.spring.config;

import com.zkn.spring.learn.service.FactoryBeanService;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zkn
 * @date 2018/4/28
 */
public class FactoryBeanMethodInterceptor implements MethodInterceptor, FactoryBean<Object> {

    private Class<?> clazz;

    @Override
    public Object getObject() throws Exception {

        return ProxyFactory.getProxy(clazz, this);
    }

    @Override
    public Class<?> getObjectType() {
        return this.clazz;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setServiceType(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("我被调用了。。。。");
        return null;
    }
}

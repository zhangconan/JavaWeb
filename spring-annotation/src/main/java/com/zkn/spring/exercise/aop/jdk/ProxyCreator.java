package com.zkn.spring.exercise.aop.jdk;

import com.zkn.spring.exercise.aop.LogicClassFir;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zkn
 * @date 2018/3/18
 */
public class ProxyCreator implements InvocationHandler {

    private Object proxy;

    private LogicClassFir logicObj;

    public ProxyCreator(Object proxy, LogicClassFir logicObj) {
        this.proxy = proxy;
        this.logicObj = logicObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logicObj.logicMethodFir();
        return method.invoke(this.proxy, args);
    }
}

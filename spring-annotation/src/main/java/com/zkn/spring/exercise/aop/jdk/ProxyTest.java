package com.zkn.spring.exercise.aop.jdk;

import com.zkn.spring.exercise.aop.LogicClassFir;
import com.zkn.spring.exercise.aop.ProxyService;
import com.zkn.spring.exercise.aop.impl.ProxyServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author zkn
 * @date 2018/3/18
 */
public class ProxyTest {

    public static void main(String[] args) {

        LogicClassFir logicClassFir = new LogicClassFir();
        ProxyService targetService = new ProxyServiceImpl();
        ProxyService proxyService = (ProxyService) Proxy.newProxyInstance(ProxyCreator.class.getClassLoader(),
                new Class[]{ProxyService.class}, new ProxyCreator(targetService, logicClassFir));
        proxyService.testProxy();
    }
}

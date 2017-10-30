package com.zkn.servlet3.initializer;

import javax.servlet.ServletContext;

/**
 * Created by zkn on 2017/10/30.
 */
public class ServletWebApplicationContextInitializer implements WebApplicationContextInitializer {
    /**
     * 容器初始化的时候做一些其他动作
     *
     * @param servletContext
     */
    @Override
    public void onStartup(ServletContext servletContext) {
        System.out.println("我是ServletWebApplicationContextInitializer");
    }
}

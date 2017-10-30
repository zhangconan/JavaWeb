package com.zkn.servlet3.initializer;

import javax.servlet.ServletContext;

/**
 * Created by zkn on 2017/10/30.
 */
public interface WebApplicationContextInitializer {
    /**
     * 容器初始化的时候做一些其他动作
     *
     * @param servletContext
     */
    void onStartup(ServletContext servletContext);
}

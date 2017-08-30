package com.zkn.spring.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 实现ApplicationContextAware接口
 * Created by zkn on 2017/8/30.
 */
@Component
public class SpringContextSecondUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 根据Class类型获取Bean
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> Object getBean(Class<T> clazz) {

        return applicationContext.getBean(clazz);
    }
}

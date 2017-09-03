package com.zkn.spring.learn.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 在单个应用中使用Spring上下文
 * Created by zkn on 2017/8/30.
 */
@Component
public class SpringApplicationContextUtil {
    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 根据Class类型获取Bean
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> Object getBean(Class<T> clazz) {

        return applicationContext.getBean(clazz);
    }
}

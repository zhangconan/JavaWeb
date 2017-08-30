package com.zkn.spring.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 观察者模式 使用事件监听器
 * Created by zkn on 2017/8/30.
 */
@Component
public class SpringContextUtil {

    private static ApplicationContext applicationContext;

    @EventListener
    public void handleEvent(ApplicationContextEvent applicationContextEvent) {
        applicationContext = applicationContextEvent.getApplicationContext();
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

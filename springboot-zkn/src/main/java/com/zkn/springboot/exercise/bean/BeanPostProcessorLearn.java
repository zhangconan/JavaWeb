package com.zkn.springboot.exercise.bean;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zkn on 2017/9/12.
 */
@Component
public class BeanPostProcessorLearn implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean != null) {
            Class<?> clazz = bean.getClass();
            Class<?> clazzObj = clazz;
            List<Class<?>> superClazz = Lists.newArrayList();
            Class<?>[] interfaces = null;
            while (clazzObj != Object.class) {
                interfaces = clazzObj.getInterfaces();
                if (interfaces != null && interfaces.length > 0) {
                    superClazz.addAll(Arrays.asList(interfaces));
                }
                clazzObj = clazzObj.getSuperclass();
            }
            if (superClazz.size() > 2) {
                System.out.println("接口超过两个的：" + bean.getClass() + " has over two interfaces....");
                System.out.println(Joiner.on(",").skipNulls().join(superClazz));
            }
            Field[] fields = clazz.getDeclaredFields();
            if (fields.length > 5) {
                System.out.println("属性超过五个的：" + bean.getClass() + " has over five properties....");
                for (int i = 0; i < fields.length; i++) {
                    System.out.println(String.format("属性名字为：%s,属性类型为%s",
                            fields[i].getName(), fields[i].getType()));
                }
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }
}

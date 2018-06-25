package com.zkn.spring.learn.getbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author zkn
 * @date 2018/6/25 23:52
 **/
@Component
public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.getBean(GetBeanByType.class);
    }
}

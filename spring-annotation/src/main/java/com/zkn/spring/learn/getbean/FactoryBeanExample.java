package com.zkn.spring.learn.getbean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author zkn
 * @date 2018/6/25
 */
@Component
public class FactoryBeanExample implements FactoryBean<CustomBean> {

    @Override
    public CustomBean getObject() throws Exception {

        return new CustomBean();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

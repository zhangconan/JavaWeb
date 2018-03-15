package com.zkn.spring.learn.base;

import com.zkn.spring.learn.service.FactoryBeanService;
import com.zkn.spring.learn.service.impl.FactoryBeanServiceImpl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author zkn
 * @date 2018/3/15
 */
@Component
public class FactoryBeanLearn implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        //这个Bean是我们自己new的，这里我们就可以控制Bean的创建过程了
        return new FactoryBeanServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanService.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}

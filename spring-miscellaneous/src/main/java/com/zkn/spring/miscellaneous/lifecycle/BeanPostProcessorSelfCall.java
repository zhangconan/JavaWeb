package com.zkn.spring.miscellaneous.lifecycle;

import com.zkn.spring.miscellaneous.service.SelfCallWrapperService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by wb-zhangkenan on 2017/5/16.
 *
 * @author wb-zhangkenan
 * @date 2017/05/16
 */
@Component
public class BeanPostProcessorSelfCall implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {

        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        if (bean instanceof SelfCallWrapperService) {
            ((SelfCallWrapperService)bean).setSelfObj(bean);
        }
        return bean;
    }
}

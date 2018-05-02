package com.zkn.spring.learn.aop.spring.config;

import com.zkn.spring.learn.service.FactoryBeanService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zkn
 * @date 2018/4/28
 */
@Configuration
public class ConfigBean {

    @Bean
    public FactoryBeanMethodInterceptor factoryBeanMethodInterceptor() {
        FactoryBeanMethodInterceptor factoryBeanMethodInterceptor = new FactoryBeanMethodInterceptor();
        factoryBeanMethodInterceptor.setServiceType(FactoryBeanService.class);
        return factoryBeanMethodInterceptor;
    }
}

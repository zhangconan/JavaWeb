package com.zkn.spring.learn.base;

import com.zkn.spring.learn.service.FactoryBeanService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zkn on 2018/3/15.
 */
public class FactoryBeanTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("classpath:com/zkn/spring/learn/base/applicationContext.xml");
        FactoryBeanService beanService = cac.getBean(FactoryBeanService.class);
        beanService.testFactoryBean();
    }
}

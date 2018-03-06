package com.zkn.spring.learn.aop.spring;

import com.zkn.spring.learn.aop.spring.service.SpringAopService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zkn on 2018/2/19.
 */
public class AopSpringTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:com/zkn/spring/learn/aop/spring/applicationContext.xml");
        SpringAopService aopService = ac.getBean(SpringAopService.class);
        aopService.testBeforeAdvice();
    }
}

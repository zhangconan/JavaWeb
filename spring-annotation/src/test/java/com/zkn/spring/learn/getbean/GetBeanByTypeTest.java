package com.zkn.spring.learn.getbean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zkn
 * @date 2018/6/25 23:55
 **/
public class GetBeanByTypeTest {

    @Test
    public void test() {
        new ClassPathXmlApplicationContext("classpath:com/zkn/spring/learn/getbean/applicationContext.xml");
    }
}

package com.zkn.spring.learn.listener;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zkn on 2017/8/30.
 */
public class MyEventPublisherTest {

    @Test
    public void test() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/zkn/spring/learn/listener/applicationContext.xml");
        MyEventSender myEventSender = context.getBean(MyEventSender.class);
        myEventSender.publishEvent();
    }
}

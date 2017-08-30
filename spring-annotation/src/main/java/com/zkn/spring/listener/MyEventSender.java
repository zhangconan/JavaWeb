package com.zkn.spring.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2017/8/30.
 */
@Component
public class MyEventSender {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishEvent(){
        MyEventDemo1 demo1 = new MyEventDemo1();
        demo1.setEmpId("WBQ1445211");
        demo1.setUserName("张三");
        //发布事件
        publisher.publishEvent(demo1);
        MyEventDemo2 demo2 = new MyEventDemo2();
        demo2.setAddress("北京市回龙观大街");
        demo2.setSchool("北京人民大学");
        //发布事件
        publisher.publishEvent(demo2);
    }
}

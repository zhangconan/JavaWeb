package com.zkn.spring.learn.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2017/8/30.
 */
@Component
public class MyEventReceiver {

    /**
     * 监听事件方法
     * 只监听MyEventDemo1事件
     *
     * @param event
     */
    @EventListener(value = MyEventDemo1.class)
    public void handlerEvent(Object event) {
        System.out.println("我是事件监听器：" + event);
    }

//    @EventListener(value = MyEventDemo1.class)
//    public void handlerEvent(Object event) {
//        System.out.println("我是事件监听器：" + event);
//    }
}

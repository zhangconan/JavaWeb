package com.zkn.spring.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2017/8/30.
 */
@Component
public class MyEventReceiver {

    /**
     * 监听事件方法
     *
     * @param event
     */
    @EventListener
    public void handlerEvent(Object event) {
        System.out.println("我是事件监听器：" + event);
    }
}

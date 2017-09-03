package com.zkn.springboot.exercise.service.impl;

import com.zkn.springboot.exercise.domain.OrderParam;
import com.zkn.springboot.exercise.service.VipUserService;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2017/9/3.
 */
@Service
public class VipUserServiceImpl implements VipUserService {

    /**
     * 创建VIP用户
     *
     * @param orderParam
     */
    @Override
    public void createVipUser(OrderParam orderParam) {
        System.out.println("创建一个VIP用户。。。");
    }

    /**
     * 监听事件创建VIP用户
     *
     * @param orderParam
     */
    @Order(1)
    @EventListener(value = OrderParam.class)
    public void handlerEvent(OrderParam orderParam) {
        createVipUser(orderParam);
    }
}

package com.zkn.springboot.exercise.service;

import com.zkn.springboot.exercise.domain.OrderParam;

/**
 * Created by zkn on 2017/9/3.
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void createOrder(OrderParam param);
}

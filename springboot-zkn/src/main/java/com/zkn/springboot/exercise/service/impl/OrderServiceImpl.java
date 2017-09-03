package com.zkn.springboot.exercise.service.impl;

import com.zkn.springboot.exercise.domain.OrderParam;
import com.zkn.springboot.exercise.service.OrderService;
import com.zkn.springboot.exercise.validator.Validator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zkn on 2017/9/3.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource(name = "orderValidator")
    private Validator validator;

    /**
     * 创建订单
     *
     * @param param
     */
    @Override
    public void createOrder(OrderParam param) {
        validator.validator(param);
        System.out.println("创建订单成功:" + param);
    }
}

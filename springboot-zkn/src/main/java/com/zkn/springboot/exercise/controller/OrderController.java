package com.zkn.springboot.exercise.controller;

import com.zkn.springboot.exercise.domain.OrderParam;
import com.zkn.springboot.exercise.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zkn on 2017/9/3.
 */
@RequestMapping("order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("createOrder")
    public String createOrder(OrderParam orderParam) {
        orderService.createOrder(orderParam);
        return "创建订单成功!";
    }
}

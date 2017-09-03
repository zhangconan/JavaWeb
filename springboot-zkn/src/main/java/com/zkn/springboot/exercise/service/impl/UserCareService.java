package com.zkn.springboot.exercise.service.impl;

import com.zkn.springboot.exercise.domain.OrderParam;
import com.zkn.springboot.exercise.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2017/9/3.
 */
@Component
public class UserCareService {

    @Autowired
    private EmailService emailService;

    @Order(2)
    @EventListener(value = OrderParam.class)
    public void handlerEvent(OrderParam orderParam) {
        emailService.sendEmail();
        System.out.println(orderParam);
    }
}

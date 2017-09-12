package com.zkn.springboot.exercise.service.impl;

import com.zkn.springboot.exercise.domain.OrderParam;
import com.zkn.springboot.exercise.service.EmailService;
import com.zkn.springboot.exercise.service.OrderService;
import com.zkn.springboot.exercise.service.VipUserService;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2017/9/12.
 */
@Service
public class BeanPostProcessorServiceImpl implements EmailService, OrderService, VipUserService {
    /**
     * 发送邮件
     */
    @Override
    public void sendEmail() {

    }

    /**
     * 创建订单
     *
     * @param param
     */
    @Override
    public void createOrder(OrderParam param) {

    }

    /**
     * 创建VIP用户
     *
     * @param orderParam
     */
    @Override
    public void createVipUser(OrderParam orderParam) {

    }
}

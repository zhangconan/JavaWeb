package com.zkn.springboot.exercise.validator.impl;

import com.zkn.springboot.exercise.detector.VipUserDetector;
import com.zkn.springboot.exercise.domain.OrderParam;
import com.zkn.springboot.exercise.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2017/9/3.
 */
@Service("orderValidator")
public class OrderValidator implements Validator {
    @Autowired
    private VipUserDetector vipUserDetector;

    /**
     * 验证器
     *
     * @param object
     */
    @Override
    public void validator(Object object) {
        OrderParam orderParam = (OrderParam) object;
        if (orderParam != null) {
            if (orderParam.getMoney() > 500L) {
                vipUserDetector.createVipUser(orderParam);
            }
        }
    }
}

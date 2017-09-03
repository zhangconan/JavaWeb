package com.zkn.springboot.exercise.detector;

import com.zkn.springboot.exercise.domain.OrderParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created by zkn on 2017/9/3.
 */
@Component
public class VipUserDetector {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void createVipUser(OrderParam orderParam) {
        eventPublisher.publishEvent(orderParam);
    }
}

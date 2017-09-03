package com.zkn.springboot.exercise.service;

import com.zkn.springboot.exercise.domain.OrderParam;

/**
 * Created by zkn on 2017/9/3.
 */
public interface VipUserService {
    /**
     * 创建VIP用户
     * @param orderParam
     */
    void createVipUser(OrderParam orderParam);
}

package com.zkn.spring.learn.dao;

import com.zkn.spring.learn.domain.OrderDomain;

/**
 * Created by zkn on 2017/9/3.
 */
public interface OrderDao {
    /**
     * 执行泛型
     * @param orderDomain
     */
    void testGeneric(OrderDomain orderDomain);
}

package com.zkn.spring.learn.dao.impl;

import com.zkn.spring.learn.dao.AbstractDao;
import com.zkn.spring.learn.dao.OrderDao;
import com.zkn.spring.learn.domain.OrderDomain;
import org.springframework.stereotype.Repository;

/**
 * Created by zkn on 2017/9/3.
 */
@Repository("orderDao")
public class OrderDaoImpl extends AbstractDao<OrderDomain> implements OrderDao {

}

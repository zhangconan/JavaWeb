package com.zkn.spring.learn.dao.impl;

import com.zkn.spring.learn.dao.AbstractDao;
import com.zkn.spring.learn.dao.UserDao;
import com.zkn.spring.learn.domain.UserDomain;
import org.springframework.stereotype.Repository;

/**
 * Created by zkn on 2017/9/3.
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<UserDomain> implements UserDao {

}

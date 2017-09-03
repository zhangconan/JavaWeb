package com.zkn.spring.learn.service.impl;

import com.zkn.spring.learn.dao.AbstractDao;
import com.zkn.spring.learn.domain.UserDomain;
import com.zkn.spring.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2017/9/3.
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private AbstractDao<UserDomain> abstractDao;

    @Override
    public void testGeneric(UserDomain userDomain) {
        abstractDao.testGeneric(userDomain);
    }
}

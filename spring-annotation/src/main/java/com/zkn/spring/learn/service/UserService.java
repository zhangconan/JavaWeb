package com.zkn.spring.learn.service;

import com.zkn.spring.learn.domain.UserDomain;

/**
 * Created by zkn on 2017/9/3.
 */
public interface UserService {
    /**
     * 泛型注入
     *
     * @param userDomain
     */
    void testGeneric(UserDomain userDomain);
}

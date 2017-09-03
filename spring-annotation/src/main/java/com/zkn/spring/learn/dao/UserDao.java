package com.zkn.spring.learn.dao;

import com.zkn.spring.learn.domain.UserDomain;

/**
 * Created by zkn on 2017/9/3.
 */
public interface UserDao {
    /**
     * 执行泛型
     * @param userDomain
     */
    void testGeneric(UserDomain userDomain);
}

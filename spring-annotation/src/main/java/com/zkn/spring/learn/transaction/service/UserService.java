package com.zkn.spring.learn.transaction.service;

import com.zkn.spring.learn.transaction.domain.UserDO;

/**
 * @author zkn
 * @date 2018/7/5 0:05
 **/
public interface UserService {
    /**
     * 插入用户
     *
     * @param userDO
     */
    void insert(UserDO userDO);
}

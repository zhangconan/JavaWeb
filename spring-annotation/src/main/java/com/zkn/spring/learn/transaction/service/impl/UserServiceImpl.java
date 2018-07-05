package com.zkn.spring.learn.transaction.service.impl;

import com.zkn.spring.learn.transaction.domain.CityChinaDO;
import com.zkn.spring.learn.transaction.domain.UserDO;
import com.zkn.spring.learn.transaction.mapper.UserMapper;
import com.zkn.spring.learn.transaction.service.CityChinaService;
import com.zkn.spring.learn.transaction.service.UserService;
import com.zkn.spring.learn.transaction.synchronize.SynchronizeLearn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author zkn
 * @date 2018/7/5 0:05
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ApplicationEventPublisher publisher;

    @Autowired
    private CityChinaService cityChinaService;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public Long insert(UserDO userDO) {
        //这里可以用AOP 用AOP的话要注意顺序
        //TransactionSynchronizationManager.registerSynchronization(new SynchronizeLearn());
        userMapper.insert(userDO);
        CityChinaDO cityChinaDO = new CityChinaDO();
        cityChinaDO.setCcityName(userDO.getUserName());
        cityChinaService.insertCityChina(cityChinaDO);
        System.out.println("插入成功了!");
        publisher.publishEvent(userDO);
        return userDO.getId();
    }
}

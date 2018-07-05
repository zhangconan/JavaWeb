package com.zkn.spring.learn.transaction.service.impl;

import com.zkn.spring.learn.transaction.domain.CityChinaDO;
import com.zkn.spring.learn.transaction.mapper.CityChinaMapper;
import com.zkn.spring.learn.transaction.service.CityChinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zkn
 * @date 2018/7/5 22:25
 **/
@Service
public class CityChinaServiceImpl implements CityChinaService {

    @Autowired
    private CityChinaMapper cityChinaMapper;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public Long insertCityChina(CityChinaDO cityChinaDO) {
        cityChinaMapper.insert(cityChinaDO);
        return cityChinaDO.getId();
    }
}

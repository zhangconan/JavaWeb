package com.zkn.spring.learn.transaction.service;

import com.zkn.spring.learn.transaction.domain.CityChinaDO;

/**
 * @author zkn
 * @date 2018/7/5 22:25
 **/
public interface CityChinaService {
    /**
     * 插入城市信息
     *
     * @param cityChinaDO
     * @return
     */
    Long insertCityChina(CityChinaDO cityChinaDO);
}

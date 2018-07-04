package com.zkn.spring.learn.transaction.mapper;

import java.io.Serializable;

/**
 * @author zkn
 * @date 2018/7/4 23:58
 **/
public interface BaseMapper<T extends Serializable, R extends Number> {
    /**
     * 插入数据
     *
     * @param t
     */
    void insert(T t);

    /**
     * 根据ID获取对象
     *
     * @param r
     * @return
     */
    <T> T getById(R r);
}

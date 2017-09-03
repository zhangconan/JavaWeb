package com.zkn.spring.learn.dao;

/**
 * Created by zkn on 2017/9/3.
 * 测试泛型注入 适用于模板方法
 */
public abstract class AbstractDao<T> {

    public final void testGeneric(T obj) {
        System.out.println(obj);
    }
}

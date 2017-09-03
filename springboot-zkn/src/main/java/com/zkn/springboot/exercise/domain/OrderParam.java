package com.zkn.springboot.exercise.domain;

import java.io.Serializable;

/**
 * Created by zkn on 2017/9/3.
 */
public class OrderParam implements Serializable {

    private static final long serialVersionUID = 2533498637811336010L;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 金额
     */
    private Long money;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "OrderParam{" +
                "userName='" + userName + '\'' +
                ", money=" + money +
                '}';
    }
}

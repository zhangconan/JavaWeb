package com.zkn.spring.learn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zkn on 2017/9/3.
 */
public class OrderDomain implements Serializable{
    private static final long serialVersionUID = 4459790844722210935L;
    /**
     * 注解ID
     */
    private Long id;
    /**
     * 日期
     */
    private Date date;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 金额
     */
    private Long money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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
        return "OrderDomain{" +
                "id=" + id +
                ", date=" + date +
                ", userName='" + userName + '\'' +
                ", money=" + money +
                '}';
    }
}

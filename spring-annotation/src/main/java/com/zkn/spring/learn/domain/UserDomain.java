package com.zkn.spring.learn.domain;

import java.io.Serializable;

/**
 * Created by zkn on 2017/9/3.
 */
public class UserDomain implements Serializable {

    private static final long serialVersionUID = -1843353392547484202L;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 地址
     */
    private String address;
    /**
     * 密码
     */
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}

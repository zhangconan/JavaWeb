package com.zkn.spring.learn.listener;

/**
 * Created by zkn on 2017/8/30.
 */
public class MyEventDemo2 {

    /**
     * 地址
     */
    private String address;
    /**
     * 学习
     */
    private String school;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "MyEventDemo2{" +
                "address='" + address + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}

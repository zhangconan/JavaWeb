package com.zkn.spring.listener;

/**
 * Created by zkn on 2017/8/30.
 */
public class MyEventDemo1 {

    private String userName;
    private String empId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "MyEventDemo1{" +
                "userName='" + userName + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }
}

package com.zkn.spring.learn.domain;

import java.io.Serializable;

/**
 * Created by zkn on 2017/9/10.
 */
public class ProvinceChinaDomain implements Serializable {

    private static final long serialVersionUID = -5124608851670535009L;
    /**
     * 注解ID
     */
    private Long id;
    /**
     * 英文名称
     */
    private String ename;
    /**
     * 中文名称
     */
    private String cname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "ProvinceChinaDomain{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
}

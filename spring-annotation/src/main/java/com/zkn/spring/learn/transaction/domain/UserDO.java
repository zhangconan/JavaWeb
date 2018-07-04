package com.zkn.spring.learn.transaction.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zkn
 * @date 2018/7/4 23:48
 **/
@Getter
@Setter
@ToString
public class UserDO implements Serializable {

    private static final long serialVersionUID = -2910288813933923034L;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 地址
     */
    private String address;
    /**
     * 创建时间
     */
    private Date createDate;
}

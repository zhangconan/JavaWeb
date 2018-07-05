package com.zkn.spring.learn.transaction.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zkn
 * @date 2018/7/5 22:24
 **/
@Getter
@Setter
@ToString
public class CityChinaDO implements Serializable {

    private static final long serialVersionUID = -1439945484820241595L;
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 省的拼音
     */
    private String ename;
    /**
     * 城市拼音
     */
    private String ecityName;
    /**
     * 城市名称
     */
    private String ccityName;
}

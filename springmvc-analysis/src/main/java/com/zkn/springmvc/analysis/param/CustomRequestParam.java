package com.zkn.springmvc.analysis.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Create By ZKN
 *
 * @date 2017/10/13
 * @time 下午10:22
 */
@ToString
@Getter
@Setter
public class CustomRequestParam implements Serializable{

    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWork;

}

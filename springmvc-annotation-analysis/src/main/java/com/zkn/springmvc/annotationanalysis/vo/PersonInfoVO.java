package com.zkn.springmvc.annotationanalysis.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Create By ZKN
 *
 * @date 2017/10/28
 * @time 下午3:03
 */
@Data
public class PersonInfoVO implements Serializable {

    private static final long serialVersionUID = 6209226160381842300L;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;

}

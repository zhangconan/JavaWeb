package com.zkn.springmvc.annotationanalysis.result;

import lombok.Data;

import java.io.Serializable;

/**
 * Create By ZKN
 *
 * @date 2017/10/28
 * @time 下午3:04
 */
@Data
public class BaseResult implements Serializable {

    private static final long serialVersionUID = 632481359614280127L;
    /**
     * 返回错误码
     */
    private String code;
    /**
     * 本次调用是否成功
     */
    private Boolean success;
    /**
     * 返回的提示信息
     */
    private String message;

}

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
public class DataResult<T> extends BaseResult implements Serializable{

    private static final long serialVersionUID = -3455148625011878678L;
    /**
     * 返回的结果集
     */
    private T data;
}

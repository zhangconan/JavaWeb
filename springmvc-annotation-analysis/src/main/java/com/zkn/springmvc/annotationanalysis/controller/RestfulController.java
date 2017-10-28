package com.zkn.springmvc.annotationanalysis.controller;

import com.zkn.springmvc.annotationanalysis.result.DataResult;
import com.zkn.springmvc.annotationanalysis.vo.PersonInfoVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By ZKN
 *
 * @date 2017/10/28
 * @time 下午3:00
 */
@RestController
@RequestMapping("rest")
public class RestfulController {
    /**
     * 返回一个字符串
     *
     * @return
     */
    @GetMapping("resultString")
    public String resultString() {
        return "我是一个字符串！";
    }

    /**
     * 返回一个json数据
     *
     * @return
     */
    @GetMapping("resultJson")
    public DataResult<PersonInfoVO> resultJson() {
        DataResult<PersonInfoVO> dataResult = new DataResult<>();
        PersonInfoVO personInfoVO = new PersonInfoVO();
        personInfoVO.setUserName("我是张三");
        personInfoVO.setPassWord("woshizhangsan");
        dataResult.setData(personInfoVO);
        dataResult.setSuccess(true);
        return dataResult;
    }
}

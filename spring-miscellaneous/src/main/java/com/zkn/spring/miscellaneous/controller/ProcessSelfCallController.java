package com.zkn.spring.miscellaneous.controller;

import com.zkn.spring.miscellaneous.service.SelfCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wb-zhangkenan on 2017/5/16.
 * 参考：
 * http://jinnianshilongnian.iteye.com/blog/1487235
 *
 * @author wb-zhangkenan
 * @date 2017/05/16
 */
@RestController
public class ProcessSelfCallController {
    @Autowired
    private SelfCallService selfCallService;

    @RequestMapping("processSelfCallA")
    public String processSelfCallA() {

        selfCallService.selfCallA();
        return "处理自我调用!";
    }

    @RequestMapping("processSelfCallB")
    public String processSelfCallB() {
        selfCallService.selfCallB();
        return "直接调用方法B!";
    }
}

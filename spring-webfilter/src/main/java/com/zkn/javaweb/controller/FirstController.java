package com.zkn.javaweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wb-zhangkenan on 2017/5/4.
 *
 * @author wb-zhangkenan
 * @date 2017/05/04
 */
@RestController
public class FirstController {

    @RequestMapping("/first")
    public String firstController(){

        return "请求成功!";
    }
}

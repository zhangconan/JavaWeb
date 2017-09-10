package com.zkn.springmvc.analysis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

    /**
     * Created by zkn on 2017/9/7.
     */
    @RestController
    public class AutowiredRequestController {

    @Autowired
    private HttpServletRequest request;

    @RequestMapping("testAutowiredRequest")
    public String testAutowiredRequest() {
        request.getParameter("userNmae");
        return "success";
    }
}

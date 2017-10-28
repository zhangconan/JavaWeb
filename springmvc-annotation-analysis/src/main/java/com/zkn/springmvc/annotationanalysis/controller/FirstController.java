package com.zkn.springmvc.annotationanalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By ZKN
 *
 * @date 2017/10/28
 * @time 上午11:06
 */
@Controller
public class FirstController {
    /**
     * 显示首页
     * @return
     */
    @RequestMapping("index")
    public String index() {
        return "index";
    }

}

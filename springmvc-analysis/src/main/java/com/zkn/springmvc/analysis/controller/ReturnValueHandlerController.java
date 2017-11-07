package com.zkn.springmvc.analysis.controller;/**
 * Created by zkn on 2017/11/7.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zkn
 * @date 2017/11/7 23:06
 */
@Controller
@RequestMapping("/returnValueHandler")
public class ReturnValueHandlerController {

    @RequestMapping("/viewNameMethod")
    public String viewNameMethodMapping() {
        return "viewNameMethod";
    }
}

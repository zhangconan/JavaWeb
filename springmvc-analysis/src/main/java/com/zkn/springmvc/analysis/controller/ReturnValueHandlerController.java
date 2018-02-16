package com.zkn.springmvc.analysis.controller;/**
 * Created by zkn on 2017/11/7.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

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

    @RequestMapping("/mapMethodProcessor")
    public Map<String, String> mapMethodProcessor() {
        Map<String, String> map = new HashMap<>(2);
        map.put("name", "张三");
        map.put("address", "北京");
        return map;
    }
}

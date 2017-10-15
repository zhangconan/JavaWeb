package com.zkn.springmvc.analysis.controller;

import com.alibaba.fastjson.JSON;
import com.zkn.springmvc.analysis.enums.TrafficEnum;
import com.zkn.springmvc.analysis.param.CustomRequestParam;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Create By ZKN
 * 所有请求格式的集合
 *
 * @date 2017/10/13
 * @time 上午8:21
 */
@RestController
@RequestMapping("allRequestFormat")
public class AllRequestFormatController {

    /**
     * 接受简单对象类型参数的请求
     *
     * @param id
     * @param userName
     * @return
     */
    @RequestMapping("simpleClassObjectRequest")
    public String simpleClassObjectRequest(Long id, String userName) {
        System.out.println(String.format("id:%d,userName:%s", id, userName));
        return "这是一个接受简单类型参数的请求";
    }

    /**
     * 带RequestParam注解的请求
     *
     * @param id
     * @return
     */
    @RequestMapping("requestParamRequest")
    public String requestParamRequest(@RequestParam("id") Long id) {
        System.out.println("参数ID为：" + id);
        return "这是一个带RequestParam注解的请求";
    }

    /**
     * 获取枚举类型的请求
     *
     * @param traffic
     * @return
     */
    @RequestMapping("requestParamEnumRequest")
    public String requestParamEnumRequest(TrafficEnum traffic) {
        if (traffic != null) {
            System.out.println(traffic.name());
        }
        return "这是一个获取枚举类型的请求";
    }

    /**
     * 解析json格式请求
     *
     * @param map
     * @return
     */
    @RequestMapping("requestBodyRequest")
    public String requestBodyRequest(@RequestBody Map map) {
        System.out.println(JSON.toJSONString(map));
        return "这是一个解析json数据格式的请求";
    }

    /**
     * 自定义对象的请求
     *
     * @param customRequestParam
     * @return
     */
    @RequestMapping("customObjectRequest")
    public CustomRequestParam customObjectRequest(CustomRequestParam customRequestParam) {

        return customRequestParam;
    }

    /**
     * 解析pathVariable注解的请求
     *
     * @return
     */
    @RequestMapping("pathVariableRequest/{name}")
    public String pathVariableRequest(@PathVariable("name") String nama) {
        System.out.println("pathVariable:" + nama);
        return "这是一个pathVariable注解的请求";
    }
}

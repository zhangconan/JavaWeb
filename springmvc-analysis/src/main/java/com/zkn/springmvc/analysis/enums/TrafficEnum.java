package com.zkn.springmvc.analysis.enums;

/**
 * Created by zkn on 2017/10/15.
 */
public enum TrafficEnum {

    RED("red", "红灯"),
    GREEN("green", "绿灯"),
    YELLOW("yellow", "黄灯");
    /**
     * 颜色
     */
    private String color;
    /**
     * 名称
     */
    private String name;

    TrafficEnum(String color, String name) {
        this.color = color;
        this.name = name;
    }
}

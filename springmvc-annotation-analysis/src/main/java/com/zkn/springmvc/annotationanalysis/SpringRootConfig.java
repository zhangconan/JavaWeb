package com.zkn.springmvc.annotationanalysis;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create By ZKN
 *
 * @date 2017/10/28
 * @time 上午9:55
 */
@Configuration
@ComponentScan(basePackages = "com.zkn.springmvc.annotationanalysis.service")
public class SpringRootConfig {

}

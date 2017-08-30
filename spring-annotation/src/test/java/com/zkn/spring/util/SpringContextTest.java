package com.zkn.spring.util;

import com.zkn.spring.utils.SpringApplicationContextUtil;
import com.zkn.spring.utils.SpringContextBean;
import com.zkn.spring.utils.SpringContextSecondUtil;
import com.zkn.spring.utils.SpringContextUtil;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zkn on 2017/8/30.
 */
public class SpringContextTest {

    @Test
    public void test() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/zkn/spring/util/applicationContext.xml");
        SpringApplicationContextUtil springApplicationContextUtil = applicationContext.getBean(SpringApplicationContextUtil.class);
        ((SpringContextBean) springApplicationContextUtil.getBean(SpringContextBean.class)).test();
        ((SpringContextBean) SpringContextUtil.getBean(SpringContextBean.class)).test();
        ((SpringContextBean) SpringContextSecondUtil.getBean(SpringContextBean.class)).test();
    }
}

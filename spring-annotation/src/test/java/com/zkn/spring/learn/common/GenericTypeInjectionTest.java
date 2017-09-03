package com.zkn.spring.learn.common;

import com.zkn.spring.learn.domain.UserDomain;
import com.zkn.spring.learn.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zkn on 2017/9/3.
 */
public class GenericTypeInjectionTest {

    @Test
    public void testInjection() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/zkn/spring/learn/common/applicationContext.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        UserDomain userDomain = new UserDomain();
        userDomain.setAddress("天通苑");
        userDomain.setUserName("张三");
        userDomain.setPassWord("**&&&&@@@@");
        userService.testGeneric(userDomain);
    }
}

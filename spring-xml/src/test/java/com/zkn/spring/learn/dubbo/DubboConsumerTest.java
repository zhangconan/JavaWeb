package com.zkn.spring.learn.dubbo;

import com.zkn.spring.shared.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zkn on 2017/11/3.
 */
public class DubboConsumerTest {

    @Test
    public void userInfoServiceTest() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/zkn/spring/learn/dubbo/dubbo-consumer.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService.getUserName());
    }
}

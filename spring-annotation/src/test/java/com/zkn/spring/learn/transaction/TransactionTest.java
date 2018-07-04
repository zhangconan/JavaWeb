package com.zkn.spring.learn.transaction;

import com.zkn.spring.learn.transaction.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zkn
 * @date 2018/7/5 0:12
 **/
public class TransactionTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("classpath:com/zkn/spring/learn/transaction/applicationContext.xml");
        UserService userService = ca.getBean(UserService.class);
    }
}

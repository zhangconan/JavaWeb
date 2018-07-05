package com.zkn.spring.learn.transaction;

import com.zkn.spring.learn.transaction.domain.UserDO;
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
        UserDO userDO = new UserDO();
        userDO.setUserName("张安");
        userDO.setPassWord("********");
        userDO.setAddress("天安门");
        userService.insert(userDO);
    }
}

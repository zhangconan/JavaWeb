package com.zkn.spring.learn.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wb-zhangkenan on 2017/8/2.
 *
 * @author wb-zhangkenan
 * @date 2017/08/02
 */
public class ClassPathApplicationContextTest {

    @Test
    public void testClassPath(){

        ClassPathXmlApplicationContext classPath = new ClassPathXmlApplicationContext("com/zkn/spring/learn/config/classpath_context.xml");
        classPath.getBean("firstExampleBean");
    }
}

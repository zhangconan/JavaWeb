package com.zkn.springboot.exercise.service;

import com.zkn.springboot.exercise.service.impl.BeanPostProcessorServiceImplTest;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by zkn on 2017/9/12.
 */
public class BeanPostProcessorTest {

    @Test
    public void testInterfaces() {
        System.out.println(Arrays.toString(BeanPostProcessorServiceImplTest.class.getInterfaces()));
    }
}

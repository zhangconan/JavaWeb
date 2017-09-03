package com.zkn.springboot.exercise.service.impl;

import com.zkn.springboot.exercise.service.EmailService;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2017/9/3.
 */
@Service
public class EmailServiceImpl implements EmailService {
    /**
     * 发送邮件
     */
    @Override
    public void sendEmail() {
        System.out.println("发送邮件。。。。。。");
    }
}

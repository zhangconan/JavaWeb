package com.zkn.spring.learn.transaction.synchronize;

import org.springframework.transaction.support.TransactionSynchronizationAdapter;

/**
 * @author zkn
 * @date 2018/7/5 22:49
 **/
public class SynchronizeLearn extends TransactionSynchronizationAdapter {

    @Override
    public void afterCommit() {
        System.out.println("事务提交之后执行。。。。。。");
    }
}

package com.zkn.spring.learn.transaction.synchronize;

import com.zkn.spring.learn.transaction.domain.UserDO;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author zkn
 * @date 2018/7/5 23:12
 **/
@Component
public class SynchronizeListener {

    @TransactionalEventListener
    public void synchronizeListener(UserDO event) {
        System.out.println("事务提交了，我才执行的！" + event);
    }
}

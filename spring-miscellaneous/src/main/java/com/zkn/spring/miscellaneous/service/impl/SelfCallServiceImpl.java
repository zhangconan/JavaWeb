package com.zkn.spring.miscellaneous.service.impl;

import javax.annotation.PostConstruct;

import com.zkn.spring.miscellaneous.service.SelfCallService;
import com.zkn.spring.miscellaneous.service.SelfCallWrapperService;
import org.springframework.aop.framework.AopContext;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by wb-zhangkenan on 2017/5/16.
 * 自我调用不走AOP的原因：
 * 当我们使用AOP代理的时候，我们的代理类调用A方法的时候，会进行拦截，如果我们在A方法中代用B方法的话，就相当于是在
 * 被代理过的类(目标类)中调用B方法，而不是在我们的代理类中调用B方法，但是目标类调用B方法是不会走AOP拦截的，
 * 因为目标类的名字和代理类的名字不一样，不再符合我们的拦截规则了。
 *
 * @author wb-zhangkenan
 * @date 2017/05/16
 */
@Service
public class SelfCallServiceImpl implements SelfCallService/*,InitializingBean*/, SelfCallWrapperService {
    //注入ApplicationContext对象
    @Autowired
    //(1)
    //private ApplicationContext applicationContext;
    //(2)
    //private SelfCallService selfCallService;
    //(3)
    //在所有属性被设置完值之后被调用(在Spring容器的声明周期中也只会被调用一次)
    //也可以通过实现InitializingBean接口，实现afterPropertiesSet方法 如果是使用XML配置的话，也可以通过指定init-method的方式
    //执行顺序PostConstruct-->afterPropertiesSet-->init-method
    //@PostConstruct
    //public void setSelfCallService(){
    //    selfCallService = applicationContext.getBean(SelfCallServiceImpl.class);
    //}
    private SelfCallService selfCall;

    /**
     * 方法A
     */
    public void selfCallA() {

        System.out.println("我是方法A");
        System.out.println("是否是AOP拦截:" + AopUtils.isAopProxy(this));
        //第一种解决自我调用的方式:这种方式的缺点是每个代理类都需要手工修改
        //这种方式主要用了ThreadLocal暴露AOP代理对象。
        //((SelfCallService)AopContext.currentProxy()).selfCallB();
        //第二种方式 从上下文中获取被代理的对象 标号为(1)、(2)、(3)、(4)的就是第二种实现自我调用的方式
        //这种方式的缺点是：不能解决scope为prototype的bean。
        //(4)
        //selfCallService.selfCallB();
        //this.selfCallB();
        //第三种方式
        selfCall.selfCallB();
    }

    /**
     * 方法B
     */
    public void selfCallB() {
        System.out.println("我是方法B");
    }

    /**
     * 设置自我调用的对象
     *
     * @param obj
     */
    public void setSelfObj(Object obj) {
        selfCall = (SelfCallService)obj;
    }

    //public void afterPropertiesSet() throws Exception {
    //    selfCallService = applicationContext.getBean(SelfCallServiceImpl.class);
    //}
}

package com.zkn.spring.miscellaneous.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by wb-zhangkenan on 2017/5/16.
 *
 * @author wb-zhangkenan
 * @date 2017/05/16
 */
@Component
@Aspect
public class SelfCallAOP {

    @Pointcut("execution(* com.zkn.spring.miscellaneous.service.SelfCallService.*(..))")
    public void pointCut(){

    }
    /*
    @Before("pointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        //获取签名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("被拦截的方法名为："+signature.getName());
    }
    */
    @Around("pointCut()")
    public void aroundAdvice(ProceedingJoinPoint pjp){
        //获取签名的信息
        Signature signature = pjp.getSignature();
        System.out.println("被拦截的方法名为："+signature.getName());
        try {
            pjp.proceed();
            System.out.println("方法执行完成:"+signature.getName());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

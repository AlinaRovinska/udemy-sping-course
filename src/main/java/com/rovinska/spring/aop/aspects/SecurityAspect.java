package com.rovinska.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-80)
public class SecurityAspect {

//    @Before("com.rovinska.spring.aop.aspects.MyPointcut.allAddMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice");
//        System.out.println("-----------------------------------------");
//    }
}

package com.rovinska.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(50)
public class ExceptionHandlerAspect {

//    @Before("com.rovinska.spring.aop.aspects.MyPointcut.allAddMethods()")
//    public void beforeGetExceptionHandlerAdvice() {
//        System.out.println("beforeGetExceptionHandlerAdvice");
//        System.out.println("-----------------------------------------");
//    }
}

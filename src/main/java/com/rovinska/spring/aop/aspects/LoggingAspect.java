package com.rovinska.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class LoggingAspect {

//    @Before("com.rovinska.spring.aop.aspects.MyPointcut.allAddMethods()")
//    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {
//
//        MethodSignature methodSignature = ((MethodSignature) joinPoint.getSignature());
//        System.out.println("methodSignature - " + methodSignature);
//        System.out.println("methodSignature.getMethod() - " + methodSignature.getMethod());
//        System.out.println("methodSignature.getReturnType() - " + methodSignature.getReturnType());
//        System.out.println("methodSignature.getName() - " + methodSignature.getName());
//
//
//        System.out.println("beforeGetLoggingAdvice");
//        System.out.println("-----------------------------------------");
//    }

//    @Before("com.rovinska.spring.aop.aspects.MyPointcut.allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice - log #2");
//    }
//
//    @Before("com.rovinska.spring.aop.aspects.MyPointcut.allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeAllLoggingAdvice() {
//        System.out.println("beforeAllLoggingAdvice - log #3");
//    }


//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice");
//    }

}

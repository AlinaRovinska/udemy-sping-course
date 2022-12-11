package com.rovinska.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyPointcut {

//    @Pointcut("execution(* com.rovinska.spring.aop.UniLibrary.get*())")
//    public void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* com.rovinska.spring.aop.UniLibrary.return*())")
//    public void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    public void allGetAndReturnMethodsFromUniLibrary() {
//    }

    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}

}

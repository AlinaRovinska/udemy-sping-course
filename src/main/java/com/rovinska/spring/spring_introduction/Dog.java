package com.rovinska.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean is created");
    }

    //    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @PostConstruct
//    protected void init() {
//        System.out.println("class Dog: init method");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("class Dog: destroy method");
//    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}

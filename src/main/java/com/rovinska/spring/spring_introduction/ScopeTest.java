package com.rovinska.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog1 = context.getBean("dog", Dog.class);
        dog1.say();

        context.close();
    }
}

package com.rovinska.spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();

        Pet cat  = context.getBean("catBean", Pet.class);
        Pet cat2  = context.getBean("catBean", Pet.class);

        Person person = context.getBean("person", Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());



        context.close();
    }
}

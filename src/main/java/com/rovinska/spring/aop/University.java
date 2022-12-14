package com.rovinska.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student st1 = new Student("Alina Rovinska", 4, 4.5);
        Student st2 = new Student("Bulka Rovinska", 2, 9.1);
        Student st3 = new Student("Pirozhok Rovinska", 7, 8.7);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents():");
        System.out.println(students);
        return students;
    }


}

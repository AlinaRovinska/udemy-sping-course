package com.rovinska.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("bookName")
    private String name;

    @Value("1998")
    private int year;

    @Value("Bulka")
    private String author;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }
}

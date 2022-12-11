package com.rovinska.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We get book from UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void returnBook() {
        System.out.println("We return book to UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void getMagazine() {
        System.out.println("We get magazine from UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return magazine from UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add book to UniLibrary");
        System.out.println("-----------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add magazine from UniLibrary");
        System.out.println("-----------------------------------------");
    }
}

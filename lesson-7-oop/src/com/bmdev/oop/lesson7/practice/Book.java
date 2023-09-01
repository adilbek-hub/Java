package com.bmdev.oop.lesson7.practice;

public class Book {
    private String title;
    private int year;
    private Autor autor;

    public Book(String title, int year, Autor autor) {
        this.title = title;
        this.year = year;
        this.autor = autor;
    }

    public void displayInfo(){
        System.out.println("Title:" + title);
        System.out.println("Year:" + year);
        autor.introduce();
    }
}

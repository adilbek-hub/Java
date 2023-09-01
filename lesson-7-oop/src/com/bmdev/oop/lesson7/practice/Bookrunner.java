package com.bmdev.oop.lesson7.practice;

public class Bookrunner {
    public static void main(String[] args) {
        Autor adilbek = new Autor("Adilbek", 31);
        Book harryPoter = new Book("Harry Poter and the Sorserer's Stone", 1997,adilbek);
        harryPoter.displayInfo();
    }
}

package com.bmdev.oop.lesson7.practice;

public class Autor {
    private String name;
    private int age;

    public Autor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("Autor:" + name + ",Age:" + age);
    }
}

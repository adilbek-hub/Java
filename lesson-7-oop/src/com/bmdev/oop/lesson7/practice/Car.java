package com.bmdev.oop.lesson7.practice;

public class Car {
    private Enginer enginer;

    public Car(Enginer enginer) {
        this.enginer = enginer;
    }

    public Enginer getEngine(){
        return enginer;
    }
}

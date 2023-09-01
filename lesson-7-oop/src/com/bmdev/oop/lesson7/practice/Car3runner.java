package com.bmdev.oop.lesson7.practice;

public class Car3runner {

    public static void main(String[] args) {
        Engine3 engine3 = new Engine3("V6");
        Car3 car3 = new Car3("Toyota","Camry",engine3);
        car3.start();
    }

}

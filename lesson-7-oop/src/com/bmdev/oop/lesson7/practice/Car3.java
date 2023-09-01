package com.bmdev.oop.lesson7.practice;
//Затем у вас есть класс Car, который использует композицию, включая объект Engine в качестве своей части:
public class Car3 {
   private String make;
   private String model;
   private Engine3 engine3;

    public Car3(String make, String model, Engine3 engine3) {
        this.make = make;
        this.model = model;
        this.engine3 = engine3;
    }

    public void start(){
        System.out.println("Car3 started");
        engine3.start(); //Вызываем метод start() объекта Engine

    }
}

package com.bmdev.oop.lesson7.practice;

public class PracticeRunner {
    public static void main(String[] args) {
       Enginer enginer = new Enginer(10,500);
       Car car = new Car(enginer);
        System.out.println(car.getEngine().getSylinder());
        System.out.println(car.getEngine().getHoursePower());
    }
}

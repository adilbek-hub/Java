package com.bmdev.oop.lesson7.practice;
//Class prestavlyushiy dvigatel
class Engine{
    private String type;
    public Engine(String type){
        this.type = type;
    }

    public void start (){
        System.out.println("Запуск двигателя типа" +type);
    }

}

//Класс представляющий автомобиль с использованием композиции двигателя
public class Car2 {
private String brand;
private Engine engine;

    public Car2(String brand, String enginetype) {
        this.brand = brand;
        this.engine = new Engine(enginetype);
    }
    public void startCar(){
        System.out.println("Запуск автомобиля марки" + brand);
        engine.start();
    }






}




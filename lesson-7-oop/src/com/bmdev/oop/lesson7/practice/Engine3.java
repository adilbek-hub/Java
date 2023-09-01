package com.bmdev.oop.lesson7.practice;
//Предположим, у вас есть класс Engine, который представляет собой двигатель:
public class Engine3 {
    private String type;


    public Engine3(String type) {
        this.type = type;

    }

    public void start(){
        System.out.println("Engine started"+type);
    }


}

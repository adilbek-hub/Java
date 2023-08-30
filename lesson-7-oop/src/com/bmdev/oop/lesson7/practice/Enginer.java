package com.bmdev.oop.lesson7.practice;

public class Enginer {
    private int sylinder;
    private int hoursePower;


    public Enginer(int sylinder, int hoursePower) {
        this.sylinder = sylinder;
        this.hoursePower = hoursePower;
    }

    public int getSylinder(){
        return  sylinder;
    }

    public int getHoursePower(){
        return hoursePower;
    }
}

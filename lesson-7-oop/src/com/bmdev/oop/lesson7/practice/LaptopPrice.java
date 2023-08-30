package com.bmdev.oop.lesson7.practice;

public class LaptopPrice {

    private double value;

    public LaptopPrice(double value) {
        this.value = value;
    }
    public double getPrice(){
        return  value;
    }

    public void setValue(double value){
        this.value = value;
    }
}

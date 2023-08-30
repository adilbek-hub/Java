package com.bmdev.oop.lesson7.practice;

public class Laptop {
    private LaptopName laptopName;
    private  LaptopPrice laptopPrice;

    public Laptop(LaptopName laptopName, LaptopPrice laptopPrice) {
        this.laptopName = laptopName;
        this.laptopPrice = laptopPrice;
    }

    public void printState(){
        System.out.println("Laptop name is " +  laptopName.getName() + ", Laptop price is " +  laptopPrice.getPrice());
    }
}

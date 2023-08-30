package com.bmdev.oop.lesson7.practice;

public class LaptopRunner {
    public static void main(String[] args) {
        LaptopName laptopName = new LaptopName("Windows");
        LaptopPrice laptopPrice = new LaptopPrice(120000);
        Laptop laptop = new Laptop(laptopName,laptopPrice);
        laptop.printState();
    }
}

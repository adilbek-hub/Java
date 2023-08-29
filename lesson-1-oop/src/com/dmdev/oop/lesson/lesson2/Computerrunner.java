package com.dmdev.oop.lesson.lesson2;

public class Computerrunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
//        computer.printState();
       Computer computer1 = new Computer(1000);
       computer1.printState();
       Computer computer2 = new Computer(1000, 5000);
       computer2.printState();
       computer2.load(true);
       computer.load();
       Computer computer3 = new Computer();
       computer3.load2(400);
       Computer computer4 = new Computer();
       computer4.load(true);


    }
}

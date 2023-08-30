package com.bmdev.oop.lesson7;
// Computer зависят от класса Ram.
public class Computer {
//5 sozdadim privatny class Ram
// Ram есть компазиция,Ram включает себя виды полей это композиция.
   private Ram ram;
   private  Ssd ssd;
   //6 Создадим конструктор который принимает эту ram
   public Computer(Ram ram, Ssd ssd) {
      this.ram = ram;
      this.ssd = ssd;
   }

   //7 получить значения из ram и ssd
   public void printState(){
      System.out.println("Ram:" + ram.getValue() + " Ssd:" + ssd.getValue());



   }



}



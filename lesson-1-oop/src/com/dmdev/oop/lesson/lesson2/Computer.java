package com.dmdev.oop.lesson.lesson2;

public class Computer {
   int ssd = 500;
   int ram;
   Computer(int ssd){
       this.ssd = ssd;
    }

    protected Computer(int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;
    }
    public Computer(){
    System.out.println("Я был создан");
}

   public void load(){
            System.out.println("Я загрузился");
        }
    void load(boolean isTrue){
        if(isTrue){
            System.out.println("Я открыл крышку");
        }
    }
    void load2(int isInt){
        System.out.println("IsInt:" + isInt);

    }

        void printState(){
            System.out.println("SSD " + ssd);
            System.out.println("RAM " + ram);
            System.out.println();
        }

}

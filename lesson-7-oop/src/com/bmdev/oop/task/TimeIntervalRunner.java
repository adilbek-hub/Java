package com.bmdev.oop.task;

public class TimeIntervalRunner {
    public static void main(String[] args) {

        TimeInterval timeInterval = new TimeInterval(50,2,1);
        System.out.println(timeInterval.totalSecunds());

      TimeInterval timeInterval2 =  new TimeInterval(timeInterval.totalSecunds());
        System.out.println(timeInterval2.totalSecunds());
        timeInterval2.print();
        TimeInterval sumInterval = timeInterval.sum(timeInterval2);
        sumInterval.print();

    }
}

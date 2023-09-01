package com.bmdev.oop.task;

public class TimeInterval {
    private int second;
    private int minute;
    private int hours;
//
    public TimeInterval(int second, int minute, int hours) {
        this.second = second;
        this.minute = minute;
        this.hours = hours;
    }

    public TimeInterval(int totalSecunds){
        this.hours = totalSecunds / 3600;
        this.minute = totalSecunds % 3600 / 60;
        this.second = totalSecunds % 3600 % 60;
    }

    public int totalSecunds(){
        return second + minute * 60 + hours * 60 * 60;
    }

    public  TimeInterval sum(TimeInterval second){
        return new TimeInterval(totalSecunds() + second.totalSecunds());
    }

    public void print(){
        System.out.println("h " + hours+ ",m " + minute + ",s " + second);
    }
}

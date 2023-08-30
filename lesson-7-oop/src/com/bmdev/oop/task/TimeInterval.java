package com.bmdev.oop.task;

public class TimeInterval {
    private int second;
    private int minute;
    private int hours;

    public TimeInterval(int second, int minute, int hours) {
        this.second = second;
        this.minute = minute;
        this.hours = hours;
    }

    public int totalSecunds(){
        return second + minute * 60 + hours * 60 * 60;
    }
}

package com.bmdev.oop.task;

public class TimeInterval2 {
    private int secund;
    private int minute;
    private  int hour;


    public TimeInterval2(int secund, int minute, int hour) {
        this.secund = secund;
        this.minute = minute;
        this.hour = hour;
    }

public int totalSecund2(){
    return secund + minute * 60 + hour * 60 * 60;
}
}

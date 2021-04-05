package com.company;

public class Time {
    int hour;
    int min;
    int sec;
    public Time() {
        hour = 6;
        min = 23;
        sec = 15;
    }
    public Time(int h, int m, int s){
        hour = h;
        min = m;
        sec = s;
    }
    public void display(){
        System.out.println("time is " + hour + ":" + min + ":" + sec);
    }
}

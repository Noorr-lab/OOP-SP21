package com.company;
public class Clock {
    public String hour;
    public String minute;
    public String second;
    public Clock(String h, String m, String s){
        hour = h;
        minute = m;
        second = s;
    }
    public void setHour(String h) {
        hour = h;
    }
    public String getHour() {
        return hour;
    }
    public void setMinute(String m) {
        minute = m;
    }
    public String getMinute() {
        return minute;
    }
    public void setSecond(String s) {
        second = s;
    }
    public String getSecond() {
        return second;
    }
    public void display(){
        System.out.println(hour + ":" + minute + ":" + second);
    }
}


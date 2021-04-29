package com.company;
public class Clock_Child extends Clock{
    public Clock_Child(String hour, String minute, String second){
        super(hour, minute, second);
    }
    @Override
    public void display() {
        System.out.println("24 Hours Format:");
        super.display();
        System.out.println("12 Hours Format");
        int hour1 = (int)hour.charAt(0) - '0';
        int hour2 = (int)hour.charAt(1)- '0';
        int tothour = hour1 * 10 + hour2;
        String t;
        if(tothour < 12)
            t = "AM";
        else
            t = "PM";
        tothour %= 12;
        if ( tothour == 0) {
            System.out.print("12");
            System.out.print(":" + minute + ":" + second);
        }
        else{
            System.out.print(tothour);
            System.out.print(":" + minute + ":" + second);
        }
        System.out.println(" " + t);
    }
}

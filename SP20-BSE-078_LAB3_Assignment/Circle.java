package com.company;

public class Circle {
    int Radius;
    public Circle(){
        Radius = 10;
    }
    public Circle(int r){
        Radius = r;
    }
    public void getcircumference(){
        double pie = 3.14;
        double c = 2*3.14*Radius;
        System.out.println(c);
    }
}

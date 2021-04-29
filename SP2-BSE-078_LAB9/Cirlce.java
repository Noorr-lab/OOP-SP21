package com.company;
public class Cirlce extends Shape{
    public Cirlce(int n, String c, String f) {
        super(n, c, f);
        numberofLines = n;
        Color = c;
        fillColor = f;
    }
    @Override
    public void Draw(){
        System.out.println("Drawing Circle");
    }
}

package com.company;
public class Triangle extends Shape{
    public Triangle(int n, String c, String f) {
        super(n, c, f);
        numberofLines = n;
        Color = c;
        fillColor = f;
    }
    @Override
    public void Draw(){
        System.out.println("Drawing Triangle");
    }
}

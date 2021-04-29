package com.company;
public class Square extends Shape {
    public Square(int n, String c, String f) {
        super(n, c, f);
        numberofLines = n;
        Color = c;
        fillColor = f;
    }
    @Override
    public void Draw(){
        System.out.println("Drawing Square");
    }
}

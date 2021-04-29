package com.company;
abstract public class Shape {
    protected int numberofLines;
    protected String Color;
    protected String fillColor;
    public Shape(int n, String c, String f){
        numberofLines = n;
        Color = c;
        fillColor = f;
    }
    public abstract void Draw();
}

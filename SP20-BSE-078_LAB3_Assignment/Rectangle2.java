package com.company;

public class Rectangle2 {
    public int length, width;
    public Rectangle2()
    {
        length = 5; width = 2;
    }
    public Rectangle2(int l, int w)
    {
        length = l; width = w;
    }
    public int Calculatearea()
    {
        return (length*width);
    }
}

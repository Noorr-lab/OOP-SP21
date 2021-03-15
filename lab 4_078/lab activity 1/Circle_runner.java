package com.company;
public class Circle_runner {
    public static void main(String[] args) {
            Circle c1 = new Circle();
            c1.setRadius(5);
            c1.display();
            int r = c1.getRadius();
            Circle c2 = new Circle(r);
            c2.setRadius(5);
            c2.display();
    }
}
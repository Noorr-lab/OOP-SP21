package com.company;
public class Point_Runner {
    public static void main(String[] args) {
        Point p1 = new Point(7,5);
        Point p2 = new Point(12,16);
        Line l1 = new Line(p1,p2);
        System.out.println("Length of line l1: " + l1.getLength());
        Point p3 = new Point();
        p3.setX(20);
        p3.setY(10);
        Line l2 = new Line(p2,p3);
        System.out.println("Length of l2: " + l2.getLength());
    }
}

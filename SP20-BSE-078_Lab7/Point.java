package com.company;
public class Point {
    private double X;
    private double Y;
    public Point(double x, double y){
        X = x;
        Y = y;
    }
    public Point(){}
    public void setX(double x){
        x = X;
    }
    public double getX(){
        return X;
    }
    public void setY(double y){
        y = Y;
    }
    public double getY(){
        return Y;
    }
    public void display(){
        System.out.println("X-coordinate: " + X);
        System.out.println("Y-coordinate: " + Y);
    }
}
class Line{
    private Point startPoint;
    private Point endPoint;
    public Line(Point s, Point e){
        startPoint = s;
        endPoint = e;
    }
    public double getLength(){
        return (Math.sqrt(Math.pow((endPoint.getX()-startPoint.getX()),2) + Math.sqrt(Math.pow((endPoint.getY()-startPoint.getY()),2))));
    }
}
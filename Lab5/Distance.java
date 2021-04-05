package com.company;

public class Distance {
    private double inch;
    private double feet;
    public Distance(){
        inch = 100;
        feet = 8.33;
    }
    public Distance(double i, double f){
        inch = i;
        feet = f;
    }
    public void setInch(double i){
        inch = i;
    }
    public void setFeet(double f){
        feet = f;
    }
    public double getInch() {
        return inch;
    }
    public double getFeet() {
        return feet;
    }
    public Distance Add(Distance Da, Distance Db){
        Distance d_new = new Distance(inch+ Da.inch + Db.inch, feet+ Da.feet + Db.feet);
        return d_new;
    }
    public void display(){
        System.out.println(inch);
        System.out.println(feet);
    }
}

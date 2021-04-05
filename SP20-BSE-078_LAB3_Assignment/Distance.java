package com.company;

public class Distance {
    int feet; int inches;
    public Distance(){
        feet = 5; inches = 8;
    }
    public Distance(int f, int i){
        feet = f; inches = i;
    }
    public void display(){
        System.out.println(feet + "'" + inches);
    }
}

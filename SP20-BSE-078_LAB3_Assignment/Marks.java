package com.company;
public class Marks {
    int Marks1;
    int Marks2;
    int Marks3;
    public Marks(){
        Marks1 = 22;
        Marks2 = 25;
        Marks3 = 27;
    }
    public Marks(int a, int b, int c ){
        Marks1 = a;
        Marks2 = b;
        Marks3 = c;
    }
    public int getSum(){
        return(Marks1 + Marks2 + Marks3);
    }
}

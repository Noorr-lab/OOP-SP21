package com.company;
public class Marks {
    private int Marks1;
    private int Marks2;
    private int Marks3;

    public Marks() {
        Marks1 = 23;
        Marks2 = 27;
        Marks3 = 24;
    }

    public Marks(int a, int b, int c) {
        Marks1 = a;
        Marks2 = b;
        Marks3 = c;
    }

    public void setMarks(int a, int b, int c) {
        Marks1 = a;
        Marks2 = b;
        Marks3 = c;
    }

    public int getMarks1() {
        return (Marks1);
    }

    public int getMarks2() {
        return (Marks2);
    }

    public int getMarks3() {
        return (Marks3);
    }

    public int CalculateSum() {
        int sum = Marks1 + Marks2 + Marks3;
        return sum;
    }
}


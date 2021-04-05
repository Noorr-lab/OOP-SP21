package com.company;

public class Marks_runner {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        System.out.println(m1.getSum());
        Marks m2 = new Marks(20,23,26);
        System.out.println(m2.getSum());
    }
}

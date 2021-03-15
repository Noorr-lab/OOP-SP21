package com.company;
public class Marks_runner {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.setMarks(12, 15, 18);
        System.out.println("Total marks M1 = " + m1.getMarks1());
        Marks m2 = new Marks();
        m2.setMarks(14, 14, 16);
        System.out.println("Total marks M2 = " + m2.getMarks2());
        Marks m3 = new Marks();
        m3.setMarks(10, 17, 20);
        System.out.println("Total marks M3 = " + m3.getMarks3());
    }
}

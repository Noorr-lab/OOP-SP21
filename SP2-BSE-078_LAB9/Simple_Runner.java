package com.company;
public class Simple_Runner {
    public static void main(String[] args) {
        Simple s = new Simple(10,15);
        System.out.println("The two numbers on which arithmetic operations are being performed are " + s.num1 + "," + s.num2);
        System.out.println("Sum of two numbers is: " + s.Add());
        System.out.println("Difference between two numbers is: " + s.Subtract());
        System.out.println("Product of two numbers is: " + s.Multiply());
        System.out.println("Dividing number 2 by number 1, we get: " + s.Divide());
    }
}

package com.company;
public class Calculator_Runner {
    public static void main(String[] args) {
        System.out.println("Product: " + Calculator.sum(5,7));
        System.out.println("Division: " + Calculator.divide(30,15));
        System.out.println("Sum: " + Calculator.multiply(6,3));
        System.out.println("Remainder: " + Calculator.modulus(10,20));
        System.out.println("Sine: " + Calculator.sin(16));
        System.out.println("cos: " + Calculator.cos(27));
        System.out.println("tan: " + Calculator.tan(15));
    }
}

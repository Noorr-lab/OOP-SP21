package com.company;
public class Computer_Runner{
    public static void main(String[] args) {
        System.out.println("Computer 1 Details");
        Computer c1 = new Computer(1500,2000,1700,1800);
        c1.display();
        System.out.println("Laptop 1 Details");
        Laptop l1 = new Laptop(1700,2000,1500,1200,12,16,14,50);
        l1.display();
        System.out.println("Computer 2 Details");
        Computer c2 = new Computer();
        c2.setWordSize(1500);
        c2.setMemorySize(2500);
        c2.setStorageSize(3500);
        c2.setSpeed(1000);
        c2.display();
        System.out.println("Laptop 2 Details");
        Laptop l2 = new Laptop();
        l2.setWordSize(2000);
        l2.setMemorySize(2200);
        l2.setStorageSize(3000);
        l2.setSpeed(1500);
        l2.setLength(15);
        l2.setWidth(16);
        l2.setHeight(16);
        l2.setWeight(60);
        l2.display();
    }
}

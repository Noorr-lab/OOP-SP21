package com.company;
public class Address_Runner {
    public static void main(String[] args) {
        Address a1 = new Address(5,212,"Islamabad",1214);
        Person p1 = new Person("Noor",34569874,a1);
        p1.display();
        Address a2 = new Address(10,125,"Islamabad",1214);
        Person p2 = new Person("Hamna",15246413,a2);
        p2.display();
    }
}
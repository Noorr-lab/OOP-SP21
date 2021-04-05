package com.company;
public class CountObjects_Runner {
    public static void main(String[] args) {
        CountObjects O1 = new CountObjects();
        CountObjects O2 = new CountObjects();
        CountObjects O3 = new CountObjects();
        System.out.println("total number of objects created = " + CountObjects.numberOfObjectsCreated());
        O1.numberOfObjectsDestroyed();
        O2.numberOfObjectsDestroyed();
        O3.numberOfObjectsDestroyed();
        System.out.println("total number of objects destroyed = " + CountObjects.numberOfObjectsDestroyed());
    }
}

package com.company;
public class CountObjects {
    private static int numberOfObjects;
    public CountObjects(){
        numberOfObjects++;
    }
    public static int numberOfObjectsCreated(){
        return numberOfObjects;
    }
    public static int numberOfObjectsDestroyed(){
        return numberOfObjects;
    }
}

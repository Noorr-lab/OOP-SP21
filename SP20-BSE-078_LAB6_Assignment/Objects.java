package com.company;
public class Objects {
    private static int Objects = 0;
    private int a;
    public Objects(int x) {
        a = x;
        Objects++;
    }
    public Objects(){
        Objects++;
    }
    public static int getObjectscreated(){
        return Objects;
    }
}

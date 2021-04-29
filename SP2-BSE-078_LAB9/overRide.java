package com.company;
public class overRide {
    public overRide(int a, int b) {
    }
    class A {
        int i, j;
        A (int a, int b) {
            i = a;
            j = b;
        }
        void show() {
            System.out.println("i and j: " + i + " " + j);
        }
    }
    static class B extends overRide {
        int k;
        B(int a, int b, int c) {
            super(a, b);
            k = c;
        }
        void show() {
            System.out.println("k: " + k);
        }
    }
}

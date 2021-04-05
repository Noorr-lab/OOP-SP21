package com.company;

public class L5H1Runner {
    public static void main(String[] args) {
        Distance d1= new Distance(10, 0.83);
        Distance d2 = new Distance(20,1.66);
        Distance d3 = new Distance();
        Distance d4 = d1.Add(d2,d3);
        d4.display();
    }
}

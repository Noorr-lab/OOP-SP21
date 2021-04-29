package com.company;
public class Movie_Runner {
    public static void main(String[] args) {
        Movie m = new Movie("R", 49, "Into the wild",1);
        Action a = new Action("PG-13", 86, "Fast and Furious",2);
        Comedy c = new Comedy("PG-13", 34, "Ted",2);
        Drama d = new Drama("G", 63, "Avengers",1);
        System.out.println("Movie: " + m);
        System.out.println("Late Fee: $" + m.calcLateFees(6));
        System.out.println("Action Movie: " + a);
        System.out.println("Late Fee: $" + a.calcLateFees(3));
        System.out.println("Comedy Movie: " + c);
        System.out.println("Late Fee: $" + c.calcLateFees(4));
        System.out.println("Drama Movie: " + d);
        System.out.println("Late Fee: $" + d.calcLateFees(1));
    }
}

package com.company;
public class Pizza_Runner {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("medium",3,1,0);
        System.out.println(p1.getDescription() + " costs " + p1.calcCost());
        Pizza p2 = new Pizza("large",2,0,1);
        System.out.println(p2.getDescription() + " costs " + p2.calcCost());
        PizzaOrder O1 = new PizzaOrder(p1);
        PizzaOrder O2 = new PizzaOrder(p2);
        System.out.println("Total Bill is: " + PizzaOrder.calcTotal());
    }
}

package com.company;
public class Pizza {
    private String sizeofPizza;
    private int numofCheesetoppings;
    int numofPepperoniToppings;
    int numofHamToppings;

    public Pizza(String s, int CT, int PT, int HT) {
        sizeofPizza = s;
        numofCheesetoppings = CT;
        numofPepperoniToppings = PT;
        numofHamToppings = HT;
    }

    public Pizza() {
    }

    public void setSizeofPizza(String sizeofPizza) {
        sizeofPizza = sizeofPizza;
    }

    public String getSizeofPizza() {
        return sizeofPizza;
    }

    public void setNumofCheesetoppings(int numofCheesetoppings) {
        numofCheesetoppings = numofCheesetoppings;
    }

    public int getNumofCheesetoppings() {
        return numofCheesetoppings;
    }

    public void setNumofPepperoniToppings() {
        numofPepperoniToppings = numofPepperoniToppings;
    }

    public int getNumofPepperoniToppings() {
        return numofPepperoniToppings;
    }

    public void setNumofHamToppings() {
        numofHamToppings = numofHamToppings;
    }

    public int getNumofHamToppings() {
        return numofHamToppings;
    }

    public double calcCost() {
        if (sizeofPizza == "small") {
            double costofPizza = 10 + (2 * numofCheesetoppings) + (2 * numofPepperoniToppings) + (2 * numofHamToppings);
            return costofPizza;
        }
        else if (sizeofPizza == "medium") {
            double costofPizza = 12 + (2 * numofCheesetoppings) + (2 * numofPepperoniToppings) + (2 * numofHamToppings);
            return costofPizza;
        }
        else if (sizeofPizza == "large"){
            double costofPizza = 14 + (2*numofCheesetoppings) + (2*numofPepperoniToppings) + (2*numofHamToppings);
        }
        return 0;
    }
    public String getDescription(){
        return ("Your final order is " + sizeofPizza + " pizza with " + numofCheesetoppings + " cheese toppings " + numofPepperoniToppings +  " pepperoni toppings " +  numofHamToppings +  " ham toppings ");
    }
}
class PizzaOrder{
    static Pizza[] p = new Pizza[3];
    private static int a = 0;
    public PizzaOrder(Pizza P){
        p[a] = P;
        a++;
    }
    public static double calcTotal(){
        double TotalBill = 0;
        for(int b = 0; b<a; b++){
            double total_bill = p[b].calcCost();
            TotalBill = TotalBill + total_bill;
        }
        return TotalBill;
    }
}
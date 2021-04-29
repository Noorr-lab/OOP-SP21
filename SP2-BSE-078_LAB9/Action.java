package com.company;
public class Action extends Movie {
    public Action(String rating, int ID, String Title, int NoOfDays) {
        super(rating, ID, Title,NoOfDays);
    }
    public double calcLateFees(int days) {
        return 3.0 * days;
    }
}

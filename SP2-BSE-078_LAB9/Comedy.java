package com.company;
public class Comedy extends Movie {
    public Comedy(String rating, int ID, String title, int NoOfDays) {
        super(rating, ID, title, NoOfDays);
    }
    public double calcLateFees(int days) {
        return 2.5 * days;
    }
}

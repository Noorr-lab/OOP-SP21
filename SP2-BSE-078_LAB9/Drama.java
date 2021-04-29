package com.company;
public class Drama extends Movie{
    public Drama(String rating, int ID, String Title, int NoOfDays) {
        super(rating, ID, Title,NoOfDays);
    }
    public double calcLateFees(int days) {
        return 2.0 * days;
    }
}

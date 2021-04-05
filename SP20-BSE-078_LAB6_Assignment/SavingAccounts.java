package com.company;
public class SavingAccounts {
    public static double annualInterestRate;
    private double savingBalance;
    public SavingAccounts(double S){
        this.savingBalance = S;
    }
    public double calculateMonthlyInterestRate() {
        double monthlyInterestRate = (savingBalance * annualInterestRate) / 12;
        double netBalance = monthlyInterestRate + savingBalance;
        System.out.println("total balance = " + netBalance);
        return netBalance;
    }
    public static double modifyInterestRate(double i){
        annualInterestRate = i;
        return annualInterestRate;
    }
}

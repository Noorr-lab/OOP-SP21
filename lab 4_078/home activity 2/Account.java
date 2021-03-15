package com.company;
public class Account {
    private double balance;
    private int AccountNumber;
    public Account(){
        balance=50000;
        AccountNumber=12345678;
    }
    public Account(int Account, double bal){
        AccountNumber=Account;
        balance=bal;
    }
    public void withdrawCash(double amountleft){
        setBalance(getBalance() - amountleft);
    }
    public void depoistCash(double amountadded){
        setBalance(getBalance() + amountadded);
    }
    public void display(){
        System.out.println("Account number = " + getAccountNumber() + "  Balance =  "+ getBalance());
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
}

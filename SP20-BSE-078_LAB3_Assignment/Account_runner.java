package com.company;

public class Account_runner {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.getbalance();
        a1 = new Account(a1.balance=1500);
        a1.getbalance();
    }
}

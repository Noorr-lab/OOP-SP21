package com.company;

public class Account {
    int balance;
    public Account(){
        balance = 1000;
    }
    public Account(int b){
        balance = b;
    }
    public void getbalance(){
        System.out.println(balance);
    }
}

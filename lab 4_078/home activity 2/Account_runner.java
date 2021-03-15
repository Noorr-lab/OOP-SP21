package com.company;
public class Account_runner {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(35000);
        acc.withdrawCash(15000);
        acc.depoistCash(20000);
        double balance =acc.getBalance();
        acc.setAccountNumber(98765432);
        acc.getAccountNumber();
        acc.display();
        Account acc1 = new Account(65327951, 85000.00);
        acc1.withdrawCash(30000);
        acc1.depoistCash(15000);
        acc1.setBalance(balance);
        acc1.getBalance();
        acc1.display();
    }
}


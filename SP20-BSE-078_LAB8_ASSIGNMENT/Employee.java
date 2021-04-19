package com.company;
public class Employee {
    protected String name;
    protected String phone;
    protected String address;
    protected int allowance;
    public Employee(String name, String phone, String address, int allowance) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.allowance = allowance;
    }
}
class Regular extends Employee {
    private int basicPay;
    public Regular(String name, String phone, String address, int allowance, int basicPay) {
        super(name, phone, address, allowance);
        this.basicPay = basicPay;
    }
    public void Display(){
        System.out.println("Name: " + name + "Phone Number: " + phone +"Address: " + address
                + "Allowance: " + allowance + "Basic Pay: " + basicPay); }
}
class Adhoc extends Employee {
    private int numberOfWorkingDays;
    private int wage;
    public Adhoc(String name, String phone, String address, int allowance, int
            numberOfWorkingDays, int wage) {
        super(name, phone, address, allowance);
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.wage = wage;
    }
    public void Display() {
        System.out.println("Name: " + name + "Phone Number: " + phone +"Address: " + address
                + "Allowance: " + allowance + "Number Of Working Days: " +
                numberOfWorkingDays + "Wage: " + wage);
    }
}

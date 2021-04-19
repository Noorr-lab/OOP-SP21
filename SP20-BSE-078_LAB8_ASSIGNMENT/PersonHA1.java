package com.company;
import java.util.Date;
public class PersonHA1 {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;
    public PersonHA1(String n, String a, String p, String e) {
        name = n;
        address = a;
        phoneNumber = p;
        emailAddress = e;
    }
    public void display() {
        System.out.println("Name: " + name + " Address: " + address + " Phone number: " + phoneNumber + " Email address: " + emailAddress);
    }
}
class Student extends PersonHA1{
    protected  String status;
    public Student(String n, String a, String p, String e, String s) {
        super(n, a, p, e);
        status = s;
    }
    public void setStatus(String s){
        status = s;
    }
    public String getStatus(){
        return status;
    }
    public void display(){
        super.display();
        System.out.println("Status: " + status);
    }
}
class employee extends PersonHA1{
    protected String office;
    protected int salary;
    protected int hiringDate;
    public employee(String n, String a, String p, String e, String o, int s, int h){
     super(n, a, p, e);
     office = o;
     salary = s;
     hiringDate = h;
    }
    public void display(){
        super.display();
        System.out.println("Office: " + office + " Salary: " + salary + " Hiring Date: " + hiringDate);
    }
}
class Faculty extends employee{
    protected int officeHours;
    protected String rank;
    public Faculty(String n, String a, String p, String e, String o, int s, int h,int H, String r){
        super(n,a,p,e,o,s,h);
        officeHours = H;
        rank = r;
    }
    public void display(){
        super.display();
        System.out.println("Office hours: " + officeHours + " Rank: " + rank);
    }
}
class Staff extends employee{
    protected String title;
    public Staff(String n, String a, String p, String e, String o, int s, int h, String t){
        super(n,a,p,e,o,s,h);
        title = t;
    }
    public void display(){
        super.display();
        System.out.println("Title: " + title);
    }
}
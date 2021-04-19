package com.company;
public class PersonHA1_Runner {
    public static void main(String[] args) {
        System.out.println("Student Details");
        Student s1 = new Student("Noor","Islamabad","03125498712","nuh_1214@yahoo.com","Student");
        s1.display();
        System.out.println("Employee Details");
        employee e1 = new employee("Hamna","Islamabad","03334578125","hamna123@gmail.com","Comsats",50000,12-4-2015);
        e1.display();
        System.out.println("Faculty Details");
        Faculty f1 = new Faculty("Fatima","Islamabad","03167083210","fatima90@gmail.com","Comsats",650000,7-6-2010,7,"Professor");
        f1.display();
        System.out.println("Staff Details");
        Staff S1 = new Staff("Anum","Islamabad","03075698712","anum.z60@yahoo.com","Techlogix",95000,22-9-2018,"Manager");
        S1.display();
    }
}

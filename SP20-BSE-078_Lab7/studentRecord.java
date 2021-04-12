package com.company;
public class studentRecord {
    private String degree;
    public studentRecord(String mba) {}
    public void setDegree ( String deg){
        degree = deg;
    }
    public String getDegree (){
        return degree;
    }
}
class employeeRecord {
    private int emp_id;
    private double salary;

    public employeeRecord(int i, int i1) {
    }

    public void setEmp_id(int id) {
        emp_id = id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setSalary(int sal) {
        salary = sal;
    }
    public double getSalary() {
        return salary;
    }
}
class Manager {
    private String title;
    private double dues;
    private employeeRecord emp;
    private studentRecord stu;

    public Manager(String t, double d, employeeRecord e, studentRecord s) {
        title = t;
        dues = d;
        emp = e;
        stu = s;
    }
    public void display() {
        System.out.println("Title is : " + title);
        System.out.println("Dues are : " + dues);
        System.out.println("Employee record is as under: " );
        System.out.println("Employee Id is : " + emp.getEmp_id());
        System.out.println("Employee salary is : " + emp.getSalary());
        System.out.println("Student record is as under: " );
        System.out.println("Degree is : " + stu.getDegree());
    }
}



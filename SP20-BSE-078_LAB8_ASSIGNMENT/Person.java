package com.company;
public class Person {
    protected String name ;
    protected String id ;
    protected int phone ;
    public Person() {
        name = "NaginaNazar" ;
        id = "sp14bcs039" ;
        phone = 12345 ;
    }
    public Person(String a , String b , int c) {
        name = a ;
        id = b ;
        phone = c ;
    }
    public void setName(String a){
        name = a ;
    }
    public void setId(String j){
        id = j ;
    }
    public void setPhone(int a) {
        phone = a ;
    }
    public String getName() {
        return name ;
    }
    public String getid() {
        return id ;
    }
    public int getPhone() {
        return phone ;
    }
    public void display( ) {
        System.out.println("Name : " + name + "ID : " + id + "Phone : " + phone ) ;
    }
}
class student extends Person {
    private String rollNo ;
    private int marks ;
    public student() {
        super() ;
        rollNo = "sp14bcs039" ;
        marks = 345 ;
    }
    public student(String a , String b , int c , String d , int e){
        super(a,b,c) ;
        rollNo = d ;
        marks = e ;
    }
    public void setRollNo(String a){
        rollNo = a ;
    }
    public void setMarks(int a ) {
        marks = a;
    }
    public String getRollNo() {
        return rollNo ;
    }
    public int getMarks() {
        return marks ;
    }
    public void display( ) {
        super.display();
        System.out.println("Roll # : " + rollNo + "\nMarks : " + marks) ;
    }
}

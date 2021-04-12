package com.company;
public class Address {
    private int streetNo;
    private int houseNo;
    private String city;
    private int code;
    public Address(int s, int h, String C, int c) {
        streetNo = s;
        houseNo = h;
        city = C;
        code = c;
    }
    public Address(){}
    public void setStreetNo(int s){
        streetNo = s;
    }
    public int getStreetNo(){
        return streetNo;
    }
    public void setHouseNo(int h){
        houseNo = h;
    }
    public int getHouseNo(){
        return houseNo;
    }
    public void setCity(String C){
        city = C;
    }
    public String getCity(){
        return city;
    }
    public void setCode(int c){
        code = c;
    }
    public int getCode(){
        return code;
    }
    public void display(){
        System.out.println("Address \n Street Number : " + streetNo + "House Number : " + houseNo + "City : " + city + "Code : " + code);
    }
}
class Person{
    private String Name;
    private int Id;
    private Address address;
    public Person(String n, int id, Address address){
        this.Name = n;
        this.Id = id;
        this.address = address;
    }
    public Person() {}
    public void setName(String name){
        this.Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setId(int id){
        this.Id = id;
    }
    public int getId(){
        return Id;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }
    public void display(){
        System.out.println(" Name: " + Name +  " \n Id: " + Id + " \n Address: " + address);
        address.display();
    }
}
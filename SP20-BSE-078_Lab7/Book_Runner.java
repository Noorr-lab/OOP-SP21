package com.company;
public class Book_Runner {
    public static void main(String[] args) {
        Address a1 = new Address(8,110,"Lahore",2021);
        Person p1 = new Person("Rachael",8356924,a1);
        Book b1 = new Book(p1,"Bleak House", "Charles Dickens");
        b1.display();
        Address a2 = new Address(12,567,"Karachi",3412);
        Person p2 = new Person("joey",761289,a2);
        Book b2 = new Book(p2,"Persuasion","Jane Auston");
        b2.display();
    }
}

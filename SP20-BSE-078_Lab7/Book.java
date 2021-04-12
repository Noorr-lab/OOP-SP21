package com.company;
public class Book {
    private Person author;
    private String bookName;
    private String publisher;
    public Book(Person a, String bn, String p){
        author = a;
        bookName = bn;
        publisher = p;
    }
    public Book(){}
    public void setAuthor(Person author) {
        this.author = author;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void display(){
        System.out.println("Book Name: " + bookName + "\n Publisher: " + publisher);
        author.display();
    }
}

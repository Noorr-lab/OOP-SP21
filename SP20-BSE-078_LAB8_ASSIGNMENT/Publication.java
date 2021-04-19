package com.company;
public class Publication {
    protected String title;
    protected int price;
    public Publication(String t, int p){
        title = t;
        price = p;
    }
    public void setTitle(String t){
        title = t;
    }
    public String getTitle(){
        return title;
    }
    public void setPrice(int p){
        price = p;
    }
    public int getPrice(){
        return price;
    }
    public void display(){
        System.out.println("Price of publication: " + title + "is $" + price);
    }
}
class Book extends Publication {
    protected int pageCount;
    public Book(String t, int p, int c) {
        super(t, p);
        pageCount = c;
    }
    public void setPageCount(int c) {
        pageCount = c;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void display(){
        super.display();
        System.out.println("Page Count: " + pageCount);
    }
}
class Tape extends Publication{
    protected int playingTime;
    public Tape(String t, int p, int T){
        super(t,p);
        playingTime = T;
    }
    public void setPlayingTime(int T){
        playingTime = T;
    }
    public int getPlayingTime(){
        return playingTime;
    }
    public void display(){
        super.display();
        System.out.println("Playing Time: " + playingTime);
    }
}
package com.company;
public class Computer {
    protected double wordSize;
    protected double memorySize;
    protected double storageSize;
    protected double Speed;
    public Computer(){
        wordSize = 300;
        memorySize = 500;
        storageSize = 700;
        Speed = 100;
    }
    public Computer(double w, double m, double s, double S){
        wordSize = w;
        memorySize = m;
        storageSize = s;
        Speed = S;
    }
    public void setWordSize(double w){
        wordSize = w;
    }
    public double getWordSize(){
        return wordSize;
    }
    public void setMemorySize(double m){
        memorySize = m;
    }
    public double getMemorySize(){
        return memorySize;
    }
    public void setStorageSize(double s){
        storageSize = s;
    }
    public double getStorageSize() {
        return storageSize;
    }
    public void setSpeed(double S){
        Speed = S;
    }
    public double getSpeed(){
        return Speed;
    }
    public void display(){
        System.out.println("Word size: " + wordSize + "bits" + " Memory size: " + memorySize + "mega bytes" + " Storage size: " + storageSize + "mega bytes" + " Speed: " + Speed + "mega hertz");
    }
}
class Laptop extends Computer{
    protected double length;
    protected double width;
    protected double height;
    protected double weight;
    public Laptop(){
        length = 10;
        width = 15;
        height = 12;
        weight = 50;
    }
    public Laptop(double w, double m, double s, double S, double l, double wid, double h, double wt){
        super(w,m,s,S);
        length = l;
        width = wid;
        height = h;
        weight = wt;
    }
    public void setLength(double l){
        length = l;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double w){
        width = w;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getHeight(){
        return height;
    }
    public void setWeight(double wt){
        weight = wt;
    }
    public double getWeight(){
        return weight;
    }
    public void display(){
        super.display();
        System.out.println("Length: " + length + " Width: " + width + " Height: " + height + " Weight: " + weight);
    }
}

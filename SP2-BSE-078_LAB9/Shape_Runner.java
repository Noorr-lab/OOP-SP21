package com.company;
public class Shape_Runner {
    public static void main(String[] args) {
        Cirlce c = new Cirlce(2,"blue","black");
        c.Draw();
        Square s = new Square(2,"purple","pink");
        s.Draw();
        Triangle t = new Triangle(2,"red","brown");
        t.Draw();
    }
}

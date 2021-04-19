package com.company;
import java.util.Scanner;
public class Publication_Runner {
    public static void main(String[] args) {
        int selection;
        Scanner sc = new Scanner(System.in);
        String[] s = {"For books press 1", "For cassette, press 2"};
        System.out.println("choose an option" + s[1] + s[2]);
        selection = sc.nextInt();
        while (selection>=2 && selection<s.length){
            if (selection==1){
                System.out.println("Enter book's title, price and page count");
                Book b1 = new Book(sc.next(),sc.nextInt(),sc.nextInt());
                b1.display();
            }
            else if (selection==2){
                System.out.println("Enter cassette's title, price and page count");
                Tape t1 = new Tape(sc.next(),sc.nextInt(),sc.nextInt());
                t1.display();
            }
            System.out.println("choose an option" + s[1] + s[2]);
            selection = sc.nextInt();
        }
    }
}

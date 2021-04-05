package com.company;

public class L5H2Runner {
    public static void main(String [] args) {
        classBook book1 = new classBook();
        book1.setAuthor("Shakespare");
        book1.setChapterNames(new String[] {"Hamlet", "Macbeth", "Romeo And Juliet"});
        classBook book2 = new classBook("Jane Austin", new  String[] {"Pride and Prejudice", "Sense and Sensibilty",
                "Emma A Novel","Persuasion"});
        classBook book3 = new classBook();
        System.out.println("Are authors of the two books same? " + book3.compareBooks(book1,book2));
        System.out.println("Book with greater number of chapters is " + book3.compareChapterNames(book1,book2));

    }
}

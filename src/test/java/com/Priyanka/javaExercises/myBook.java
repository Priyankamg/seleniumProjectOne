package com.Priyanka.javaExercises;

/**
 * Created by Priyanka on 7/27/2016.
 */
public class myBook extends book {
    int price;

    public myBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

package com.Priyanka.javaExercises;

/**
 * Created by Priyanka on 7/27/2016.
 */
public abstract class book {
    String title;
    String author;

    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void display();
}

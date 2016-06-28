package com.Priyanka.headFirstJavaTests.Chapter3Tests;

import com.Priyanka.headFirstJava.Chapter3.movie;

/**
 * Created by Priyanka on 6/20/2016.
 */
public class movieTest {
    public static void main(String[] args) {
        movie one = new movie();

        one.title = "A stroll in the woods";
        one.genre = "Humour";
        one.rating = -5;

        System.out.println("Movie 1 details:");
        System.out.println("Title: " + one.title);
        System.out.println("Genre: " + one.genre);
        System.out.println("Rating: " + one.rating);

        movie two = new movie();

        two.title = "12 Angry Men";
        two.genre = "Serious";
        two.rating = (int) 9.2;
        System.out.println("Movie 2 details:");
        System.out.println("Title: " + two.title);
        System.out.println("Genre: " + two.genre);
        System.out.println("Rating: " + two.rating);
        two.play();


        movie  three = new movie();
        three.title = "Ankho Dekhi";
        three.genre = "Humour";
        three.rating = 7;
        System.out.println("Movie 3 details:");
        System.out.println("Title: " + three.title);
        System.out.println("Genre: " + three.genre);
        System.out.println("Rating: " + three.rating);
    }

}

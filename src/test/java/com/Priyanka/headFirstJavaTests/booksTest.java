package com.Priyanka.headFirstJavaTests;

import com.Priyanka.headFirstJava.books;

/**
 * Created by Priyanka on 6/22/2016.
 */
public class booksTest {
    public static void main(String[] args) {
        books[] myBooks  = new books[3];
        int x = 0;
        myBooks[0] = new books();
        myBooks[1] = new books();
        myBooks[2] = new books();

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java cookbook";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";

        while(x < myBooks.length) {
            System.out.println(myBooks[x].title + " by " + myBooks[x].author);
            x = x + 1;
        }

    }
}

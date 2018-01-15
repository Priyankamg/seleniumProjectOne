package com.Priyanka.dataStructuresTest.collectionsTest;

import com.Priyanka.dataStructures.collections.Book;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by prinks on 1/15/18.
 */
public class BookArrayList {
    public static void main(String[] args) {
        ArrayList<Book> bookArrayList = new ArrayList<Book>();

        Book b1 = new Book(201,"Let us C","Yeshwanth Kanetkar","BPB",8);
        Book b2 = new Book(202,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book b3 = new Book(202,"Operating System","Galvin","Wiley",6);


        bookArrayList.add(b1);
        bookArrayList.add(b2);
        bookArrayList.add(b3);

        for(Book b : bookArrayList) {
            System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor() + " " + b.getPublisher() + " " + b.getQuantity());
        }
    }
}

package com.Priyanka.dataStructuresTest.collectionsTest;

import com.Priyanka.dataStructures.collections.Book;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by prinks on 1/15/18.
 */
public class BookLinkedList {
    public static void main(String[] args) {
        List<Book> bookLinkedList = new LinkedList<Book>();

        Book b1 = new Book(501,"Harry Potter","J K Rowling","xyz",7);
        Book b2 = new Book(502,"The Enchanted Wood","Enid Blyton","abc",1);
        Book b3 = new Book(503, "The sky is falling","Sidney Sheldon","pqr",2);
        Book b4 = b1;

        bookLinkedList.add(b1);
        bookLinkedList.add(b2);
        bookLinkedList.add(b3);
        bookLinkedList.add(b4);

        Iterator iterator = bookLinkedList.iterator();
        while (iterator.hasNext()) {
            Book b = (Book) iterator.next();
            System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor() + " " + b.getPublisher() + " " + b.getQuantity());
        }
    }
}

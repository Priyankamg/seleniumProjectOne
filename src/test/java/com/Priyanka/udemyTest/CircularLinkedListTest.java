package com.Priyanka.udemyTest;

import udemy.CircularLinkedList;

/**
 * Created by prinks on 11/20/17.
 */
public class CircularLinkedListTest {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(4);
        circularLinkedList.insertFirst(3);
        circularLinkedList.insertFirst(2);
        circularLinkedList.insertFirst(1);
        circularLinkedList.insertRear(5);
        circularLinkedList.insertRear(6);
        circularLinkedList.insertRear(7);
        circularLinkedList.insertRear(8);

        circularLinkedList.displayLinkedList();

        circularLinkedList.deleteFirst();
        circularLinkedList.deleteFirst();
        circularLinkedList.displayLinkedList();

        circularLinkedList.deleteLast();
        circularLinkedList.deleteLast();
        circularLinkedList.displayLinkedList();
    }
}

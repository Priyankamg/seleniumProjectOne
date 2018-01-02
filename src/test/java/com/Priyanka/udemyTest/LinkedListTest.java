package com.Priyanka.udemyTest;

import udemy.LinkedList;

/**
 * Created by prinks on 11/19/17.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(6);

        l.printLinkedList();
        System.out.println("Length of Linked List: " + l.lengthLinkedList());

//        l.delete();
//        l.delete();
//        l.delete();
//        l.delete();
//        l.delete();
//        l.printLinkedList();
    }
}

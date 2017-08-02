package com.Priyanka.dsaTest;

import com.Priyanka.dsa.LinkedList;

/**
 * Created by prinks on 7/30/17.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(2);
        l.insert(4);
        l.insert(6);
        l.insert(8);
        l.insert(10);

        System.out.println("Linked List after inserting 5 elements:");
        l.printLinkedList();

        l.remove();
        l.remove();
        System.out.println("Linked List after removing 2 elements:");
        l.printLinkedList();
    }
}

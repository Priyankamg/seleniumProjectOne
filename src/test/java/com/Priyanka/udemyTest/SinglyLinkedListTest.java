package com.Priyanka.udemyTest;


import udemy.SinglyLinkedList;

/**
 * Created by prinks on 11/20/17.
 */
public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(1);
        singlyLinkedList.insertFirst(2);
        singlyLinkedList.insertFirst(3);
        singlyLinkedList.insertFirst(4);
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.insertLast(8);
        singlyLinkedList.insertLast(9);
        singlyLinkedList.insertLast(10);
        singlyLinkedList.insertLast(11);
        singlyLinkedList.displayLinkedList();
    }
}

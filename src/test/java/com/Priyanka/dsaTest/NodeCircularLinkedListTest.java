package com.Priyanka.dsaTest;

import com.Priyanka.dsa.NodeCircularLinkedList;

/**
 * Created by prinks on 9/10/17.
 */
public class NodeCircularLinkedListTest {
    public static void main(String[] args) {
        NodeCircularLinkedList l = new NodeCircularLinkedList();
        l.insertLast(10);
        l.insertLast(20);
        l.insertLast(30);
        l.insertLast(40);
        l.insertLast(50);
        l.displayLinkedList();
        System.out.println("---------");

        NodeCircularLinkedList l2 = new NodeCircularLinkedList();
        l2.insertFirst(5);
        l2.insertFirst(4);
        l2.insertFirst(3);
        l2.insertFirst(2);
        l2.insertFirst(1);
        try {
            l2.displayLinkedList();
            System.out.println("------");

            System.out.println("Deleting the first element from the linked list: " + l2.deleteFirst());
            l2.displayLinkedList();
            System.out.println("------");


            System.out.println("Deleting the last element in the linked list: " + l2.deleteLast());
            l2.displayLinkedList();
            System.out.println("----");

            System.out.println("Deleting the last element in the linked list: " + l2.deleteLast());
            l2.displayLinkedList();
            System.out.println("----");

            System.out.println("Deleting the first element from the linked list: " + l2.deleteFirst());
            l2.displayLinkedList();
            System.out.println("------");

            System.out.println("Deleting the last element in the linked list: " + l2.deleteLast());

            System.out.println(">>>");
            System.out.println("Deleting the last element in the linked list: " + l2.deleteLast());
            System.out.println(">>>");

//            l2.displayLinkedList();
//            System.out.println("----");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        l2.insertLast(100);
        l2.insertLast(200);
        l2.insertLast(300);
        l2.insertLast(400);
        l2.insertLast(500);

        try {
            l2.displayLinkedList();
            System.out.println("===");
            System.out.println("Deleting the first element from the linked list: " + l2.deleteFirst());
            l2.displayLinkedList();
            System.out.println("===");

            System.out.println("Deleting the first element from the linked list: " + l2.deleteFirst());
            l2.displayLinkedList();
            System.out.println("===");

            System.out.println("Deleting the first element from the linked list: " + l2.deleteFirst());
            l2.displayLinkedList();
            System.out.println("===");

            System.out.println("Deleting the first element from the linked list: " + l2.deleteFirst());
            l2.displayLinkedList();
            System.out.println("===");

            System.out.println("Deleting the first element from the linked list: " + l2.deleteFirst());
          //  l2.displayLinkedList();
            System.out.println("===");

            System.out.println("Deleting the first element from the linked list: " + l2.deleteFirst());
           // l2.displayLinkedList();
            System.out.println("===");

        System.out.println("Deleting the first element from the linked list: " + l2.deleteFirst());

        } catch (NullPointerException e) {
            e.printStackTrace();
        }




    }
}

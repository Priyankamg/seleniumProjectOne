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

        NodeCircularLinkedList l2 = new NodeCircularLinkedList();
        l2.insertFirst(5);
        l2.insertFirst(4);
        l2.insertFirst(3);
        l2.insertFirst(2);
        l2.insertFirst(1);
        l2.displayLinkedList();
    }
}

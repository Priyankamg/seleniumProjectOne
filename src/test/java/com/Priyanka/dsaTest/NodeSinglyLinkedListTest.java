package com.Priyanka.dsaTest;

import com.Priyanka.dsa.NodeSinglyLinkedList;
import com.Priyanka.dsa.SinglyLinkedList;

/**
 * Created by prinks on 9/10/17.
 */
public class NodeSinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertLast(2);
        ll.insertLast(4);
        ll.insertLast(6);
        ll.insertLast(8);
        ll.insertLast(10);
        ll.displayList();
        System.out.println("------------");

        SinglyLinkedList l2 = new SinglyLinkedList();
        l2.insertHead(10);
        l2.insertHead(9);
        l2.insertHead(8);
        l2.insertHead(7);
        l2.insertHead(6);
        l2.insertLast(11);
        l2.insertLast(12);
        l2.insertLast(13);
        l2.displayList();
        System.out.println("-------------");

        NodeSinglyLinkedList n = l2.deleteFirst();
        System.out.print(n + " ");
        n.displayNode();
        System.out.println("--------");
        l2.displayList();


    }
}

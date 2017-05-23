package com.Priyanka.algorithmsTest;

import com.Priyanka.algorithms.linkedListInteger;
import com.Priyanka.algorithms.node;

/**
 * Created by prinks on 5/11/17.
 */
public class linkedListIntegerTest {
    public static void main(String[] args) {
        linkedListInteger l1 = new linkedListInteger();
        l1.insert(2);
        l1.insert(4);
        l1.insert(6);
        l1.insert(8);
        l1.insert(10);
        System.out.println("Linked List before:");
        l1.printLinkedList();

        l1.insert(5,3);
        l1.insert(9,6);
        System.out.println("Linked List After:");
        l1.printLinkedList();

        l1.delete();
        System.out.println("Linked List after deleting the last element");
        l1.printLinkedList();

        l1.deleteNodeAtPosition(3);
        System.out.println("Linked list after deleting node in between the list at position 3:");
        l1.printLinkedList();

        l1.deleteNodeAtPosition(4);
        System.out.println("Linked List after deleting node at last position");
        l1.printLinkedList();
    }
}

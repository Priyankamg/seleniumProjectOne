package com.Priyanka.dataStructuresTest.collectionsTest;

import com.Priyanka.dataStructures.collections.LinkedListRev;
import com.Priyanka.dataStructures.collections.Node;

import java.util.LinkedList;

/**
 * Created by prinks on 1/17/18.
 */
public class TestLinkedListRev {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1.add(2);
        linkedList1.add(4);
        linkedList1.add(3);

        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        linkedList2.add(5);
        linkedList2.add(6);
        linkedList2.add(4);

        Node n1 = new Node(linkedList1.get(0));
        Node n2 = new Node(linkedList1.get(1));
        Node n3 = new Node(linkedList1.get(2));
        n1.setNext(n2);
        n2.setNext(n3);

        Node n4 = new Node(linkedList2.get(0));
        Node n5 = new Node(linkedList2.get(1));
        Node n6 = new Node(linkedList2.get(2));
        n4.setNext(n5);
        n5.setNext(n6);

        LinkedListRev linkedListRev = new LinkedListRev();
        linkedListRev.addTwoNumbers(n1, n4);

    }
}

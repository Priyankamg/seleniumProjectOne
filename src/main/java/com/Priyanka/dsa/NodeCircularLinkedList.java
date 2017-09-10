package com.Priyanka.dsa;

/**
 * Created by prinks on 9/10/17.
 */
public class NodeCircularLinkedList {
    NodeSinglyLinkedList first;
    NodeSinglyLinkedList last;

    public NodeCircularLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        NodeSinglyLinkedList node = new NodeSinglyLinkedList();
        node.data = data;

        if(isEmpty()) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void insertLast(int data) {
        NodeSinglyLinkedList node = new NodeSinglyLinkedList();
        node.data = data;

        if(isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void displayLinkedList() {
        NodeSinglyLinkedList node = first;

        while(node!=last.next) {
            System.out.println(node + " " + node.data + " " + node.next);
            node = node.next;
        }
    }
}

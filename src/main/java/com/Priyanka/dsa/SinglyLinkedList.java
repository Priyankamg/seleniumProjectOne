package com.Priyanka.dsa;

/**
 * Created by prinks on 9/9/17.
 */
public class SinglyLinkedList {
    NodeSinglyLinkedList first;

    public boolean isEmpty() {
        return first==null;
    }

    public void insertHead(int data) {
        NodeSinglyLinkedList node = new NodeSinglyLinkedList();
        node.data = data;

        if(isEmpty()) {
            node.next = first;
            first = node;
        } else {
            first = node;
        }
    }

    public void insertFirst(int data) {
        NodeSinglyLinkedList node = new NodeSinglyLinkedList();
        node.data = data;
        node.next = first;
        first = node;
    }

    public NodeSinglyLinkedList deleteFirst() {
        NodeSinglyLinkedList temp = first;
        first = first.next;
        return temp;
    }

    public void insertLast(int data) {
        NodeSinglyLinkedList node = new NodeSinglyLinkedList();
        node.data = data;

        if(!isEmpty()) {
            NodeSinglyLinkedList temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        } else {
            first = node;
        }
    }

    public void displayList() {
        NodeSinglyLinkedList temp = first;
        while(temp != null) {
            System.out.println(temp + " " + temp.data + " " + temp.next);
            temp = temp.next;
        }
    }
}

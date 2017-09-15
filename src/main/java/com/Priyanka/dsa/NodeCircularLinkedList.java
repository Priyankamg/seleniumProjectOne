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
        if(!isEmpty()) {
            while (node != last.next) {
                System.out.println(node + " " + node.data + " " + node.next);
                node = node.next;
            }
        } else {
            throw new NullPointerException("No elements in the Linked List");
        }
    }

    public int deleteFirst() {
        NodeSinglyLinkedList temp = first;
        if(!isEmpty()) {
            first = first.next;
            return temp.data;
        } else {
            throw new NullPointerException("Inside deleteFirst: No elements in the Linked List");
        }
    }

    public int deleteLast() {
        NodeSinglyLinkedList temp = first;

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
        if(!isEmpty()) {
            int data = last.data;
            if (!(first == last)) {
                while (temp.next != last) {
                    temp = temp.next;
                }
                last = temp;
                last.next = null;

            } else {
                last = null;
                first = null;
            }
            return data;
        } else {
            throw new NullPointerException("Inside DeleteLast: No elements to delete in the Linked List");
        }

    }

}

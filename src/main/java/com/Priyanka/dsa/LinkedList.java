package com.Priyanka.dsa;

/**
 * Created by prinks on 7/29/17.
 */
public class LinkedList {

    static Node head;

    public void insert(int number) {
        Node n, temp;

        if(head==null) {
            n = new Node(number, null);
            head = n;
        } else {
            temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            n = new Node(number, null);
            temp.next = n;
        }
    }

    public void printLinkedList() {
        Node temp;
        temp = head;
        while(temp != null) {
            System.out.print(temp + " " + temp.number + " " + temp.next);
            System.out.println();
            temp = temp.next;
        }
    }

    public void remove() {
        Node temp;
        temp = head;
        while((temp.next).next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void insertAtPosition(int number, int position) {

    }
}

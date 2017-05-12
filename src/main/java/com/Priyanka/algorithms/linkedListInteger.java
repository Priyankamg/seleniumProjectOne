package com.Priyanka.algorithms;

/**
 * Created by prinks on 5/11/17.
 */
public class linkedListInteger implements linkedListOperations{
    private node n;
    private static node head;



    public void insert(int data, int position) {
        n = new node();
        n.data = data;
        n.next = null;

        int count = 1;

        node before, after;
        before = head;
        after = head;

        while(count != (position-1)) {
            before = before.next;
            count++;
        }
        count = 1;
        while(count != position) {
            after = after.next;
            count++;
        }

        n.next = after;
        before.next = n;

    }

    public void insert(int data) {
        n = new node();
        n.data = data;
        n.next = null;
        if(head == null) {
            head = n;
        } else {
            node temp;
            temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void delete() {
        int length;
        node temp;
        temp = head;
        if(temp.next==null) {
            head = null;
        } else {
            length = 1;
            while (temp.next != null) {
                temp = temp.next;
                length++;
            }

            int i = 1;
            temp = head;
            while(i != (length-1)) {
                temp = temp.next;
                i++;
            }
            temp.next = null;
        }
    }

    public void deleteNodeWithData(int data) {

    }

    public void deleteNodeAtPosition(int position) {

    }

    public void printLinkedList() {
        node temp;
        temp = head;
        while(temp.next != null) {
            System.out.println("Object: " + temp + " Data: " + temp.data + " Address: " + temp.next);
            temp = temp.next;
        }
        System.out.println("Object: " + temp + " Data: " + temp.data + " Address: " + temp.next);
    }
}

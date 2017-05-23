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
        node temp;

        if(head!=null) {
            temp = head;
            if(temp.next==null) {
                head = null;
            } else {
                while((temp.next).next!=null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    public void deleteNodeWithData(int data) {

    }

    public void deleteNodeAtPosition(int position) {
        node before, after, temp;
        int length;
        int numberOfNodes = 0;

        if(head!=null) {
            before = head;
            after = head;
            temp = head;
            if(before.next==null) {
                head = null;
            } else {
                while (temp.next!=null) {
                    temp = temp.next;
                    numberOfNodes++;
                }
                length = 0;
                while((length+1) < (position-1)) {
                    before = before.next;
                    length++;
                }
                if(position!=numberOfNodes) {
                    length = 0;
                    while ((length + 1) != (position + 1)) {
                        after = after.next;
                        length++;
                    }
                    before.next = after;
                } else {
                    before.next = null;
                }
            }
        }
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

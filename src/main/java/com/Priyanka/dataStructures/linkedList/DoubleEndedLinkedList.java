package com.Priyanka.dataStructures.linkedList;

/**
 * Created by prinks on 1/31/18.
 */
public class DoubleEndedLinkedList {
    private LinkD first;
    private LinkD last;

    public DoubleEndedLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first==null);
    }

    public void insertFirst(double dData) {
        LinkD linkD = new LinkD(dData);

        if(isEmpty()) {
            last = linkD;
        }
        linkD.setNext(first);
        first = linkD;
    }

    public void insertLast(double dData) {
        LinkD linkD = new LinkD(dData);

        if(isEmpty()) {
            first = linkD;
            last = linkD;
        }
        last.setNext(linkD);
        last = linkD;
    }

    public LinkD deleteFirst() throws NullPointerException {
        if(!isEmpty()) {
            LinkD temp = first;
            first = first.getNext();
            return temp;
        } else {
            throw new NullPointerException("Linked List is empty");
        }
    }

    public void display() throws NullPointerException {
        if(!isEmpty()) {
            LinkD temp = first;
            while(temp != null) {
                temp.display();
                temp = temp.getNext();
            }
        } else {
            throw new NullPointerException("Linked List is empty");
        }
    }
}

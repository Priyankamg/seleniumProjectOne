package com.Priyanka.dataStructures.linkedList;

/**
 * Created by prinks on 1/31/18.
 */
public class LinkD {
    private double dData;
    private LinkD next;

    public LinkD(double dData) {
        this.dData = dData;
    }

    public void display() {
        System.out.print(dData + " ");
    }

    public void setNext(LinkD next) {
        this.next = next;
    }

    public LinkD getNext() {
        return next;
    }
}

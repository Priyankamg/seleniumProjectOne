package com.Priyanka.dataStructures.linkedList;

/**
 * Created by prinks on 1/20/18.
 */
public class Link {
    private int iData;
    private double dData;
    private Link next;

    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
        this.next = null;
    }

    public void display() {
        System.out.println("{" + iData + "," + dData + "," + next + "}");
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public int getiData() {
        return iData;
    }

    public Double getdData() {
        return dData;
    }
}

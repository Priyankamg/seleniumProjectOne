package com.Priyanka.dataStructures.linkedList;

/**
 * Created by prinks on 1/31/18.
 */
public class Node {
    private int iData;
    private double dData;
    private Node next;

    public Node(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
    }

    public int getiData() {
        return iData;
    }

    public double getdData() {
        return dData;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void display() {
        System.out.println("{" + iData + ", " + dData + ", " + next + "}");
    }
}

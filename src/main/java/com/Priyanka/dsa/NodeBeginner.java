package com.Priyanka.dsa;

/**
 * Created by prinks on 9/9/17.
 */
public class NodeBeginner {
    int data;
    NodeBeginner next = null;

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(NodeBeginner next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public NodeBeginner getNext() {
        return next;
    }
}

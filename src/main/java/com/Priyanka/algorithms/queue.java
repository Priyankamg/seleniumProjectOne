package com.Priyanka.algorithms;

/**
 * Created by Priyanka on 8/3/2016.
 */
public class queue {
    private String[] queueArray;
    private int queuesize;
    private int front, rear = 0;

    public queue(int queuesize) {
        this.queuesize = queuesize;
        queueArray = new String[queuesize];
    }

    public void insert(String element) throws queueFullException{
        if(rear < queuesize) {
            queueArray[rear] = element;
            rear++;
        } else {
            throw new queueFullException("Queue full");
        }
    }

    public void remove() throws queueEmptyException {

    }
}

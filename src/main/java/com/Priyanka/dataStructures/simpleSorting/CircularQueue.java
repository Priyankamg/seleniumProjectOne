package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/10/18.
 */
public class CircularQueue {
    private int[] queueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int numberOfElements;

    public CircularQueue(int size) {
        maxSize = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;
        numberOfElements = 0;
    }

    public boolean isFull() {
        return rear == maxSize-1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void insert(int element) {
        if(isFull()) {
            rear = -1;
        }

        queueArray[++rear] = element;

        if(!isFull())
            numberOfElements++;
    }

    public int remove() throws Exception {
        if(!isEmpty()) {
            int element = queueArray[front];
            front++;
            numberOfElements--;
            return element;
        } else {
            throw new Exception("Queue is empty.");
        }
    }

    public void display() {
        for(int i=front; i<=rear; i++)
            System.out.print(queueArray[i] + " ");
        System.out.println();
    }
}

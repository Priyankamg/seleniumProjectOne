package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/10/18.
 */
public class Queue {
    private int[] queueArray;
    private int numberElements;
    private int front;
    private int rear;
    private int maxSize;

    public Queue(int size) {
        queueArray = new int[size];
        numberElements = 0;
        front = 0;
        rear = -1;
        maxSize = size;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == maxSize-1;
    }

    public void insert(int element) throws Exception {
        if(!isFull()) {
            queueArray[++rear] = element;
            numberElements++;
        } else {
            throw new Exception("Queue is Full.");
        }
    }

    public int remove() throws Exception {
        if(!isEmpty()) {
            int element = queueArray[front];
            front++;
            numberElements--;
            return element;
        } else {
            throw new Exception("Queue is Empty.");
        }
    }

    public void display() {
        for(int i=front; i<=rear; i++)
            System.out.print(queueArray[i] + " ");
        System.out.println();
    }
}

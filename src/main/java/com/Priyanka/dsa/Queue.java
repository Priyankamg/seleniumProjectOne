package com.Priyanka.dsa;

/**
 * Created by prinks on 7/29/17.
 */
public class Queue {
    int maxSize;
    long[] queueArray;
    int first;
    int last;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        this.first = -1;
        this.last = -1;
    }

    public void push(long element) {
        if(!isFull()) {
            if (first == -1 && last == -1) {
                first++;
            }
            last++;
            queueArray[last] = element;
        } else {
            System.out.println("Queue is full");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public long pop() {
        if(!isEmpty()) {
            long firstElementInQueue = queueArray[first];
            first++;
            return firstElementInQueue;
        } else {
            System.out.println("Queue is empty");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public boolean isEmpty() {
        return (first == last+1);
    }

    public boolean isFull() {
        return (last == (maxSize-1));
    }

    public void printQueue() {
        for(int i=0; i<=last; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }
}

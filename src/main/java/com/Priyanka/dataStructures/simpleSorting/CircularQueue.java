package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/10/18.
 */
public class CircularQueue {
    private int[] circularQueueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int numberElements;

    public CircularQueue(int size) {
        circularQueueArray = new int[size];
        maxSize = size;
        front = 0;
        rear = -1;
        numberElements = 0;
    }

    public boolean isEmpty() {
        return numberElements == 0;
    }

    public boolean isFull() {
        return numberElements == maxSize;
    }

    public void insert(int element) throws Exception {
        if(!isFull()) {
                if(rear==maxSize-1 && front>0)
                    rear = -1;

                if(front==maxSize && rear>=0)
                    front = 0;

                circularQueueArray[++rear] = element;
                numberElements++;
            } else {
            throw new Exception("Queue is full");
        }
    }

    public int remove() throws Exception {
        if(!isEmpty()) {
            if(front==maxSize && rear>=0)
                front = 0;
            int element = circularQueueArray[front];
            front++;
            numberElements--;
            return element;
        } else {
            throw new Exception("Queue is empty");
        }
    }

    public void display() {
        if(front < rear) {
            for(int i=front; i<=rear; i++) {
                System.out.print(circularQueueArray[i] + " ");
            }
            System.out.println();
        } else {
            if(rear>0) {
                for(int i=0; i<rear; i++)
                    System.out.print(circularQueueArray[i] + " ");
            }
            for(int i=rear; i<front; i++)
                System.out.print(circularQueueArray[i] + " ");

            for(int i=front; i<=maxSize-1; i++)
                System.out.print(circularQueueArray[i] + " ");
            System.out.println();
        }

    }
}

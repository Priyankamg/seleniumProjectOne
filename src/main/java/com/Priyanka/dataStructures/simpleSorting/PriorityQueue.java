package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/11/18.
 */
public class PriorityQueue {
    private int[] priorityQueueArr;
    private int maxSize;
    private int numberOfElements;

    public PriorityQueue(int size) {
        maxSize = size;
        priorityQueueArr = new int[size];
        numberOfElements = 0;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public boolean isFull() {
        return numberOfElements == maxSize;
    }

    public void insert(int element) throws Exception {
        if(!isFull()) {
            if(numberOfElements==0)
                priorityQueueArr[numberOfElements] = element;
            else {
                int i;
                for(i=numberOfElements-1; i>=0; i--) {
                    if(priorityQueueArr[i] < element) {
                         priorityQueueArr[i+1] = priorityQueueArr[i];
                    } else {
                        break;
                    }
                }
                priorityQueueArr[i+1] = element;
            }
            numberOfElements++;
        } else {
            throw new Exception("Priority Queue is full.");
        }
    }

    public int remove() throws Exception {
        if(!isEmpty()) {
            int element = priorityQueueArr[numberOfElements-1];
            numberOfElements--;
            return element;
        } else {
            throw new Exception("Priority Queue is empty.");
        }
    }

    public int peek() throws Exception {
        if(!isEmpty()) {
            return priorityQueueArr[numberOfElements-1];
        } else {
            throw new Exception("Priority Queue is empty.");
        }
    }

    public void display() {
        for(int i=0; i<numberOfElements; i++) {
            System.out.print(priorityQueueArr[i] + " ");
        }
        System.out.println();
    }
}

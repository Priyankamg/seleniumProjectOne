package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/12/18.
 */
public class DoubleEndedQueue {
    private int[] deqArr;
    private int maxSize;
    private int numberOfElements;
    private int frontLeft;
    private int rearLeft;
    private int frontRight;
    private int rearRight;

    public DoubleEndedQueue(int size) {
        deqArr = new int[size];
        maxSize = size;
        numberOfElements = 0;
        rearRight = -1;
        frontRight = 0;
        rearLeft = maxSize - 2;
        frontLeft = maxSize - 1;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public boolean isFull() {
        return numberOfElements == maxSize;
    }

    public void insertRight(int element) throws Exception {
        if(!isFull()) {
            deqArr[++rearRight] = element;
            numberOfElements++;
        } else {
            throw new Exception("Double Ended Queue is full");
        }
    }

    public int removeLeft() throws Exception {
        if(!isEmpty()) {
            int element = deqArr[frontRight];
            frontRight++;
            numberOfElements--;
            return element;
        } else {
            throw new Exception("Double Ended Queue is empty");
        }
    }


}

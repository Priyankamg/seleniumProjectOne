package com.Priyanka.dsa;

/**
 * Created by prinks on 7/29/17.
 */
public class StackAgain {
    int maxSize;
    long[] stackArray;
    int top;

    public StackAgain(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element) {
        top++;
        stackArray[top] = element;
    }

    public long pop() {
        long topmostElement = stackArray[top];
        top--;
        return topmostElement;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == (maxSize-1));
    }

    public void printStack() {
        for(int i=0; i<stackArray.length;i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

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
        if(!isFull()) {
            top++;
            stackArray[top] = element;
        } else {
            System.out.println("The stack is full.");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public long pop() {
        if(!isEmpty()) {
            long topmostElement = stackArray[top];
            top--;
            return topmostElement;
        } else {
            System.out.println("The stack is empty.");
            throw new ArrayIndexOutOfBoundsException();
        }
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

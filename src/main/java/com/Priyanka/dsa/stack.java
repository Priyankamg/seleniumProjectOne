package com.Priyanka.dsa;

/**
 * Created by prinks on 7/23/17.
 */
public class stack {
    int maxSize;
    long[] stackArray;
    int top;

    public stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[size];
        this.top = -1;
    }

    public void push(long item) {
        stackArray[top+1] = item;
        top++;
    }

    public long pop() {
        long thePoppedItem = stackArray[top];
        top--;
        return thePoppedItem;
    }

    public void printStack() {
        for(int i=0; i<=top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println("");
    }
}

package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/11/18.
 */
public class StackStrings {
    private String[] stackStrArr;
    private int maxSize;
    private int top;

    public StackStrings(int size) {
        stackStrArr = new String[size];
        maxSize = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize-1;
    }

    public void push(String element) throws Exception {
        if(!isFull()) {
            stackStrArr[++top] = element;
        } else {
            throw new Exception("Stack is full.");
        }
    }

    public String pop() throws Exception {
        if(!isEmpty()) {
            String elementTop = stackStrArr[top];
            top--;
            return elementTop;
        } else {
            throw new Exception("Stack is empty.");
        }
    }
}

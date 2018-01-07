package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/7/18.
 */
public class StackChar {
    private char[] arr;
    private int top;
    private int maxSize;

    public StackChar(int size) {
        arr = new char[size];
        top = -1;
        maxSize = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize-1;
    }

    public void push(char element) throws Exception {
        if(!isFull()) {
            arr[++top] = element;
        } else {
            throw new Exception("Stack is full");
        }
    }

    public char pop() throws Exception {
        if(!isEmpty()) {
            char elementAtTop = arr[top--];
            return elementAtTop;
        } else {
            throw new Exception("Stack is empty");
        }
    }

    public char peek() throws Exception {
        if(!isEmpty()) {
            return arr[top];
        } else {
            throw new Exception("Stack is empty");
        }
    }
}

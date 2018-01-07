package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/7/18.
 */
public class Stack {
    private int[] arr;
    private int top;
    private int maxSize;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
        maxSize = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize-1;
    }

    public void push(int element) throws Exception {
        if(!isFull()) {
            arr[++top] = element;
        } else {
            throw new Exception("Stack is full");
        }
    }

    public int pop() throws Exception {
        if(!isEmpty()) {
            int elementAtTop = arr[top--];
            return elementAtTop;
        } else {
            throw new Exception("Stack is empty");
        }
    }

    public int peek() throws Exception {
        if(!isEmpty()) {
            return arr[top];
        } else {
            throw new Exception("Stack is empty");
        }
    }
}

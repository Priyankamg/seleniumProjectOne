package com.Priyanka.dsa;

/**
 * Created by prinks on 7/29/17.
 */
public class ReverseString {
    int maxSize;
    char[] stringArray;
    int top;

    public ReverseString(int maxSize) {
        this.maxSize = maxSize;
        this.stringArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char ch) {
        if(!isFull()) {
            top++;
            stringArray[top] = ch;
        } else {
            System.out.println("The stack is full. Cannot insert any more elements into the stack");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public char pop() {
        if(!isEmpty()) {
            char c = stringArray[top];
            top--;
            return c;
        } else {
            System.out.println("The stack is empty. Cannot pop out any more elements from the stack.");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public boolean isFull() {
        return (top == (maxSize-1));
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void printString() {
        for(int i=0; i<=top; i++) {
            System.out.print(stringArray[i]);
        }
        System.out.println();
    }
}

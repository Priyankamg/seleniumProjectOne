package com.Priyanka.algorithms;

/**
 * Created by Priyanka on 8/3/2016.
 */
public class stack {
    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    public stack(int stackSize) {
        this.stackSize = stackSize;
        stackArray = new String[stackSize];
    }

    public void push(String input) throws stackFullException{
        if(topOfStack+1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else {
            throw new stackFullException("Sorry! Stack is full");
        }
    }

    public String pop() throws stackEmptyException {
        if(topOfStack==-1) {
            throw new stackEmptyException("Stack is empty. Cannot pop anything");
        } else {
            return stackArray[topOfStack--];
        }
    }

    public String peek() throws stackEmptyException {
        if(topOfStack==-1) {
            throw new stackEmptyException("Stack Empty. Cannot Peek");
        } else {
            return stackArray[topOfStack];
        }
    }

    public void displayStack() throws stackEmptyException{
        if(topOfStack == -1) {
            throw new stackEmptyException("Stack empty. Nothing to display");
        } else {
            for (int i = 0; i <= topOfStack; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public void pushMany(String valueSeparatedBySpaces) throws stackFullException{
        String[] values = valueSeparatedBySpaces.split(" ");
        for(int i=0; i<values.length; i++) {
            push(values[i]);
        }
    }

    public void popAll() throws stackEmptyException {
        for(int i=topOfStack; i>-1; i--) {
            pop();
        }
    }

    public String[] getStackArray() {
        return stackArray;
    }
}

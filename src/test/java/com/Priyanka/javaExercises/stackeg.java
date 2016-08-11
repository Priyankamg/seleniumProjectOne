package com.Priyanka.javaExercises;

import java.util.LinkedList;

/**
 * Created by Priyanka on 8/10/2016.
 */
public class stackeg {
    LinkedList stack;

    public stackeg() {
        stack =  new LinkedList();
    }

    public void push(String aStr) {
        stack.addLast(aStr);
    }

    public String pop() {
        return (String) stack.removeLast();
    }

    public String peek() {
        return (String) stack.getLast();
    }

    public static void main(String[] args) {
        stackeg strStk = new stackeg();
        strStk.push("Hi");
        strStk.push("there!, ");
        strStk.push("how");
        strStk.push("are");
        strStk.push("you?");

        System.out.println("Top of stack: " + strStk.pop());
        System.out.println("Now, the top of stack is: " + strStk.peek());
    }
}

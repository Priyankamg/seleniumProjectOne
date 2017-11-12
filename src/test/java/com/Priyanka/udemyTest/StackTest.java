package com.Priyanka.udemyTest;

import udemy.Stack;
import udemy.StackChar;

/**
 * Created by prinks on 11/11/17.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        try {
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }


}

package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.Stack;
import com.Priyanka.dataStructures.simpleSorting.StackChar;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/7/18.
 */
public class StackTest {
    Stack stack;

    @Test
    public void testPushPop() {
        stack = new Stack(10);
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
        } catch (Exception e) {
            e.printStackTrace();
        }

        while(!stack.isEmpty()) {
            try {
                System.out.print(stack.pop() + " ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public String reverseString(String input) {
        StackChar stackChar;
        stackChar = new StackChar(input.length());
        for(int i=0; i<input.length(); i++) {
            try {
                stackChar.push(input.charAt(i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String output = "";
        while(!stackChar.isEmpty()) {
            try {
                output += stackChar.pop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return output;
    }

    @Test
    public void testReverseString() {
        String rev = reverseString("Rahul Sharma");
        System.out.println("Reverse string: " + rev);
    }
}

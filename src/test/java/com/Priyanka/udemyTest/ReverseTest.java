package com.Priyanka.udemyTest;

import java.util.Stack;

/**
 * Created by prinks on 11/11/17.
 */
public class ReverseTest {
    public String reverse(String initial) {
        String reverseString = "";
        Stack stack = new Stack();
        for(int i=0; i<initial.length(); i++) {
            stack.push(initial.charAt(i));
        }

        while(!stack.isEmpty()) {
            reverseString += stack.pop();
        }

        return reverseString;
    }

    public static void main(String[] args) {
        ReverseTest rt = new ReverseTest();
        System.out.println(rt.reverse("Hello!"));
    }


}

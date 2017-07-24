package com.Priyanka.dsaTest;

import com.Priyanka.dsa.stack;

/**
 * Created by prinks on 7/23/17.
 */
public class stackTest {
    public static void main(String[] args) {
        stack s1 = new stack(10);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.printStack();
        s1.pop();
        s1.printStack();
        s1.pop();
        s1.pop();
    }
}

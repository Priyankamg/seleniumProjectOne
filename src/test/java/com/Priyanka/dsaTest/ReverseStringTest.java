package com.Priyanka.dsaTest;

import com.Priyanka.dsa.ReverseString;

/**
 * Created by prinks on 7/29/17.
 */
public class ReverseStringTest {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString(7);
        try {
            rs.push('A');
            rs.push('b');
            rs.push('h');
            rs.push('i');
            rs.push('n');
            rs.push('a');
            rs.push('v');
            rs.printString();
            while(!rs.isEmpty()) {
                System.out.print(rs.pop());
            }
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}

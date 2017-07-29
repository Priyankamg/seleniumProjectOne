package com.Priyanka.dsaTest;

import com.Priyanka.dsa.ReverseString;

/**
 * Created by prinks on 7/29/17.
 */
public class ReverseTest {
    public static void main(String[] args) {
        System.out.println("Reverse string: " + reverseString("Abhinav Priyanka"));
    }

    public static String reverseString(String str) {
        String reverseString = "";
        ReverseString rs = new ReverseString(str.length());
        for(int i=0; i<str.length(); i++) {
            rs.push(str.charAt(i));
        }
        while(!rs.isEmpty()) {
            reverseString += rs.pop();
        }
        return reverseString;
    }
}

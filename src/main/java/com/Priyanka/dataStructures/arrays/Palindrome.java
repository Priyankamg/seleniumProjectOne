package com.Priyanka.dataStructures.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by prinks on 1/30/18.
 */
public class Palindrome {

    public boolean isPalindrome(String input) {
        String output = new StringBuilder(input).reverse().toString();
        return output.equals(input);
    }

    public boolean isPalindromeImp2(String input) {
        String output = "";
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for(int i=0; i<input.length(); i++) {
            arrayList.add(input.charAt(i));
        }
        Collections.reverse(arrayList);

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            output += iterator.next();
        }

        return output.equals(input);
    }
}

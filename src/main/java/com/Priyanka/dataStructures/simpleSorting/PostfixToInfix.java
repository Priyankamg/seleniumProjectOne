package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/11/18.
 */
public class PostfixToInfix {
    public String convertPostfixToInfix(String input) {
        StackStrings stackStrings;
        stackStrings = new StackStrings(input.length());

        for(int i=0; i<input.length(); i++) {
            try {
                if(input.charAt(i)=='+' || input.charAt(i)=='-' || input.charAt(i)=='*' || input.charAt(i)=='/') {
                    String s1 = stackStrings.pop();
                    String s2 = stackStrings.pop();
                    stackStrings.push(s2 + input.charAt(i) + s1);
                } else {
                    stackStrings.push(String.valueOf(input.charAt(i)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            return stackStrings.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}

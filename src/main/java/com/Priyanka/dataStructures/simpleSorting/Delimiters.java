package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/7/18.
 */
public class Delimiters {

    public boolean checkDelimiters(String input) {
        StackChar stackChar = new StackChar(input.length());
        char expectedChar;
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i)=='{' || input.charAt(i)=='[' || input.charAt(i)=='(')
            {
                try {
                    stackChar.push(input.charAt(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if(input.charAt(i)=='}') {
                expectedChar = '{';
                try {
                    if(expectedChar != stackChar.pop())
                        return false;
                } catch (Exception e) {
                    return false;
                }
            }

            if(input.charAt(i)==']') {
                expectedChar = '[';
                try {
                    if(expectedChar != stackChar.pop())
                        return false;
                } catch (Exception e) {
                    return false;
                }
            }

            if(input.charAt(i)==')') {
                expectedChar = '(';
                try {
                    if(expectedChar != stackChar.pop())
                        return false;
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return stackChar.isEmpty();
    }
}

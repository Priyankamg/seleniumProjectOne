package com.Priyanka.headFirstJavaTests.Chapter11Tests;

/**
 * Created by Priyanka on 7/21/2016.
 * NumberFormatException, NullPointerException, Arithmetic Exception
 * All of the above are runtime exceptions. These are unchecked exceptions.
 * However, if you know that the method you are writing will cause any such exception,
 * you can put the method in a try catch block.
 */
public class numberformatexception {
    public static void main(String[] args) {
        String s = "two";
        try {
            int i = Integer.parseInt(s);
            System.out.println("Value of i is: " + i);
        } catch (NumberFormatException nfe) {
            System.out.println("Trying to assign a non-digit string and convert it to an int");
            nfe.printStackTrace();
        }
    }
}

package com.Priyanka.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by prinks on 10/23/17.
 */
public class sentence {

    public String getSentence(String text, Set<String> dictionary) {

            String textModified = text;
            for(int i=1; i<textModified.length(); i++) {
                String prefix = textModified.substring(0,i);
                System.out.println("Prefix: " + prefix);
                if(dictionary.contains(prefix)) {
                    String suffix = textModified.substring(i, textModified.length());
                    System.out.println("Suffix: " + suffix);
                    textModified = suffix;
                    if(dictionary.contains(suffix)) {
                        return prefix + " " + suffix;
                    }
                }
            }
            return null;
    }

    public static void main(String[] args) {
        sentence s = new sentence();
        System.out.println(s.getSentence("iamastudentfromwaterloo", new HashSet<String>(Arrays.asList("from", "waterloo", "hi", "am", "yes", "i", "a", "student"))));
    }
}

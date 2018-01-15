package com.Priyanka.dataStructuresTest.collectionsTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by prinks on 1/15/18.
 */
public class testRetainAll {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("Stark");
        s1.add("Arya");
        s1.add("Circee");
        s1.add("Richard");

        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("Stark");
        s2.add("Tony");

        s1.retainAll(s2); // Retains only those elements in s1 that are present in s2

        Iterator iterator = s1.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}

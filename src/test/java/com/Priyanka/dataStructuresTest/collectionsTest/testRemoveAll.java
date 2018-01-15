package com.Priyanka.dataStructuresTest.collectionsTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by prinks on 1/15/18.
 */
public class testRemoveAll {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("Gregory");
        s1.add("McGonnagle");
        s1.add("Dumbledore");
        s1.add("James");
        s1.add("Lily");
        s1.add("Snape");

        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("James");
        s2.add("Lily");

        s1.removeAll(s2);

        Iterator iteratorS1 = s1.iterator();
        while(iteratorS1.hasNext()) {
            System.out.println(iteratorS1.next());
        }
    }
}

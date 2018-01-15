package com.Priyanka.dataStructuresTest.collectionsTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by prinks on 1/15/18.
 */
public class testArrayListAddAll {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("Ajith");
        s1.add("Vijay");
        s1.add("Surya");

        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("Tara");
        s2.add("Aishwarya");

        s1.addAll(s2);

        Iterator iterator = s1.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}

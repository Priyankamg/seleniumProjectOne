package com.Priyanka.dataStructures.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by prinks on 1/4/18.
 */
public class duplicatesString {
    public static void main(String[] args) {
        String str = "I came I saw I left";
        String[] strArr = str.split(" ");

        Set<String> resultSet = new HashSet<String>();

        for(String s : strArr) {
            resultSet.add(s);
        }

        Iterator<String> resultSetIterator = resultSet.iterator();
        while(resultSetIterator.hasNext()) {
            System.out.print(resultSetIterator.next() + " ");
        }
    }
}

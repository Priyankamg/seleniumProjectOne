package com.Priyanka.dataStructures.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by prinks on 1/4/18.
 */
public class UnderstandLinkedHashSet {
    public static void main(String[] args) {
        int[] arr = {10, 2, 2, 3, 3, 2, 3, 3, 1, 1, 9, 10, 15, 10, 10, 20, 25, 30};

        Set<Integer> resultSet = new LinkedHashSet<Integer>();

        for(int i : arr)
            resultSet.add(i);

        Iterator<Integer> iterator = resultSet.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

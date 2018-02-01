package com.Priyanka.dataStructures.arrays;

import java.util.HashSet;

/**
 * Created by prinks on 1/31/18.
 */
public class noDups {
    public HashSet<Integer> noDuplicates(int[] input) throws Exception {
        if(input.length>0) {
            HashSet<Integer> hashSet = new HashSet<Integer>();
            for(int i : input)
                hashSet.add(i);
            return hashSet;
        }
        throw new Exception("Input Array is Empty");
    }
}

package com.Priyanka.dataStructures.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prinks on 1/17/18.
 */
public class IndicesOfSum {
    public int[] bruteForce(int[] input, int sum) {
        int[] result = new int[2];
        for(int i=1; i<input.length-1; i++) {
            for(int j=i+1; j<input.length; j++) {
                if(input[i] + input[j] == sum) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] usingHashMap(int[] input, int sum) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i=0; i<input.length; i++) {
            hashMap.put(input[i],i);
        }

        for(int i=0; i<input.length; i++) {
            int complement = sum - input[i];
            if(hashMap.containsKey(complement) && hashMap.get(complement)!=i) {
                return new int[] {i, hashMap.get(complement)};
            }
        }
        throw new IllegalArgumentException("No 2 sum solution");
    }

    public int[] optimisedHashMap(int[] input, int sum) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i=0; i<input.length; i++) {
            int complement = sum - input[i];
            if(hashMap.containsKey(complement))
                return new int[] {hashMap.get(complement),i};
            hashMap.put(input[i],i);
        }
        throw new IllegalArgumentException("No 2 sum solution");
    }


}

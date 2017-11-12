package com.Priyanka.algorithms;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by prinks on 10/24/17.
 */
public class secMostRepeatingWord {
    public String secondMostRepeatingWord(String str) {

        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        for(String s: str.split(" ")) {
            if(!hashMap.containsKey(s)) {
                hashMap.put(s,1);
            } else {
                hashMap.put(s,hashMap.get(s)+1);
            }
        }
        System.out.println(hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        for(String s: hashMap.keySet()) {
            treeMap.put(hashMap.get(s),s);
        }
        System.out.println(treeMap);
        return treeMap.size()<2 ? treeMap.get(treeMap.keySet().toArray()[treeMap.size()-1]) : treeMap.get(treeMap.keySet().toArray()[treeMap.size()-2]);
    }

    public static void main(String[] args) {
        secMostRepeatingWord s = new secMostRepeatingWord();
        System.out.println(s.secondMostRepeatingWord("aaa bbb ccc aaa bbb bbb bbb aaa aaa ccc aaa ddd ddd ddd ddd ccc bbb ccc aaa ccc eee qqq qqq"));
        System.out.println(s.secondMostRepeatingWord("aaa bbb aaa bbb bbb"));
    }
}

package com.Priyanka.algorithms;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by prinks on 10/23/17.
 */
public class SecondMostRepeatingWord {
    private void secondMostRepeatingWord(String str) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String s : str.split(" ")) {
            if(!map.containsKey(s)) {
                map.put(s,1);
            } else {
                map.put(s,map.get(s)+1);
            }
        }
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        TreeMap<Integer, String> finalMap = new TreeMap<Integer, String>();
        for(String s : map.keySet()) {
            finalMap.put(map.get(s), s);
        }
        System.out.println(finalMap);
    }

    public static void main(String[] args) {
        SecondMostRepeatingWord s = new SecondMostRepeatingWord();
        s.secondMostRepeatingWord("abc ddd abc test abc ddd test");
    }

}

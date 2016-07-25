package com.Priyanka.javaExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Priyanka on 7/25/2016.
 */
public class nameNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Map<String,Integer> nameNum = new HashMap<String,Integer>();
        for(int i=0; i<n; i++) {
            String name = s.next();
            int phone = s.nextInt();
            nameNum.put(name,phone);
        }
        while (s.hasNext()) {
            String naam = s.next();
            try {
                int number = nameNum.get(naam);
                System.out.println(naam + "=" + number);
            } catch (NullPointerException ne)  {
                System.out.println("Not found");
            }
        }
    }
}

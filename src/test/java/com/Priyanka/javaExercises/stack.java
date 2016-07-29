package com.Priyanka.javaExercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Priyanka on 7/29/2016.
 */
public class stack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String[] pushArr;
        String[] incArr;
        int element1;
        int element2;
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
            String str = s.nextLine();
            if(str.contains("push")) {
                pushArr = str.split(" ");
                intArr.add(Integer.parseInt(pushArr[1]));
            }
            if(str.contains("pop")) {
                intArr.remove(intArr.size()-1);
            }
            if(str.contains("inc")) {
                incArr = str.split(" ");
                element1 = Integer.parseInt(incArr[1]);
                element2 = Integer.parseInt(incArr[2]);

                for(int j=0; j<element1;j++) {
                    int number = intArr.get(j) + element2;
                    intArr.remove(j);
                    intArr.add(j,number);
                }
            }
            if(intArr.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(intArr.get(intArr.size() - 1));
            }
        }
    }
}

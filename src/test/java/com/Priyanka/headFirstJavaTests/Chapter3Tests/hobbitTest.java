package com.Priyanka.headFirstJavaTests.Chapter3Tests;

import com.Priyanka.headFirstJava.Chapter3.hobbit;

/**
 * Created by Priyanka on 6/22/2016.
 */
public class hobbitTest {
    public static void main(String[] args) {
        hobbit[] h = new hobbit[3];
        int z = -1;
        while (z < 2) {
            z = z + 1;
            h[z] = new hobbit();
            h[z].name = "bilbo";
            if(z==1){
                h[z].name = "frodo";
            }
            if(z==2) {
                h[z].name = "sam";
            }
            System.out.println(h[z].name + " is a good hobbit name");
        }
    }
}

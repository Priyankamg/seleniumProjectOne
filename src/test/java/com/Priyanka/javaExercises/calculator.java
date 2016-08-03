package com.Priyanka.javaExercises;

/**
 * Created by Priyanka on 8/3/2016.
 */
public class calculator implements advancedArithmetic {
    public int divisor(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==0)
                sum += i;
        }
        return sum;
    }
}

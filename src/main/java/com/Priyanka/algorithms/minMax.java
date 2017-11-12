package com.Priyanka.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by prinks on 10/26/17.
 */
public class minMax {
    public static void main(String[] args) {
        int n = 5;
        Scanner s = new Scanner(System.in);

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);

        long min =0;
        long max = 0;

        Arrays.sort(arr);
        
        
        for(int i=0; i<n; i++) {
            if(i<(n-1)) {
                min += arr[i];
            }
            if(i>0) {
                max += arr[i];
            }
        }
        System.out.println(min + " " + max);

    }
    }


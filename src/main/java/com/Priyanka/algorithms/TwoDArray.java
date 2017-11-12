package com.Priyanka.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by prinks on 10/26/17.
 */
public class TwoDArray {
    public static void main(String[] args) {
        int n = 6;
        Scanner s = new Scanner(System.in);
        int[][] array2D = new int[n][n];
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        int max = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                array2D[i][j] = s.nextInt();
            }
        }

        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                sumList.add(array2D[i][j] + array2D[i][j+1] + array2D[i][j+2] + array2D[i+1][j+1] + array2D[i+2][j] + array2D[i+2][j+1] + array2D[i+2][j+2]);
            }
        }

        for(int i=0; i<sumList.size(); i++) {
            System.out.print(sumList.get(i) + " ");
        }
        System.out.println();

        if(sumList.size()>=0)
            max = sumList.get(0);

        for(int i=1; i<sumList.size(); i++) {
            if(sumList.get(i)>max) {
                max = sumList.get(i);
            }
        }

        System.out.println(max);

    }

}

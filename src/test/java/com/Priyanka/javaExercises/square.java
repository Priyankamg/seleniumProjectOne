package com.Priyanka.javaExercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Priyanka on 7/29/2016.
 */
public class square {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        String[] _arr = new String[_arr_size];
        String _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            try {
                _arr_item = in.nextLine();
            } catch (Exception e) {
                _arr_item = null;
            }
            _arr[_arr_i] = _arr_item;
        }

        res = getMinimumUniqueSum(_arr);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }


    static int[] getMinimumUniqueSum(String[] arr) {
        String A, B;
        int AInt, BInt;
        int count;
        String[] splitArr;
        int[] arrToReturn = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            count = 0;
            splitArr = arr[i].split(" ");
            A = splitArr[0];
            B = splitArr[1];
            AInt = Integer.parseInt(A);
            BInt = Integer.parseInt(B);
            for(int j=AInt; j<=BInt; j++) {
                int res = (int) Math.sqrt(j);
                if(res*res==j) {
                    count++;
                }
            }
        arrToReturn[i] = count;
        }
    return arrToReturn;
    }
}

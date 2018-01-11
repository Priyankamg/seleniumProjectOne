package com.Priyanka.dataStructures.simpleSorting;

import java.util.Arrays;

/**
 * Created by prinks on 1/11/18.
 */
public class TestArraySum {
    public void printPairs(int[] inputArr, int sum) {
        if (inputArr.length > 0) {
            Arrays.sort(inputArr);
            for(int i : inputArr) {
                System.out.print(i + " ");
            }
            System.out.println();
            int ascPtr, descPtr;

            descPtr = inputArr.length - 1;
            ascPtr = 0;

            while (descPtr >= ascPtr) {
                if (inputArr[descPtr] >= sum)
                    descPtr--;
                else {
                    for (int j = ascPtr; j < descPtr; j++) {
                        if (inputArr[descPtr] + inputArr[j] == sum) {
                            System.out.println(inputArr[descPtr] + "," + inputArr[j]);
                            ascPtr = j;
                            break;
                        }
                    }
                    descPtr--;
                    ascPtr++;
                }
            }
        }
    }
}

package com.Priyanka.dataStructures.arrays;


/**
 * Created by prinks on 1/31/18.
 */
public class Find {

    public MinMax findMinMax(int[] input) throws  IllegalArgumentException {
        if(input.length > 0) {
            MinMax minMax = new MinMax();
            minMax.setMin(input[0]);
            minMax.setMax(input[0]);

            for(int i=1; i<input.length; i++) {
                if(input[i] > minMax.getMax())
                    minMax.setMax(input[i]);

                if(input[i] < minMax.getMin())
                    minMax.setMin(input[i]);
            }

            return minMax;
        }
        throw new IllegalArgumentException("The input array contains no elements");
    }
}

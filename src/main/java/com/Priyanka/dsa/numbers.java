package com.Priyanka.dsa;

/**
 * Created by prinks on 7/23/17.
 */
public class numbers {
    int[] nums;
    int count;

    public numbers(int[] nums) {
        this.nums = nums;
    }

    public int countEvenNumbers() {
        count = 0;
        for(int i=0;i<nums.length;i++) {
            if((nums[i]%2)==0) {
                count++;
            }
        }
        return count;
    }

    public int countOddNumbers() {
        count = 0;
        for(int i=0;i<nums.length;i++) {
            if((nums[i]%2)!=0) {
                count++;
            }
        }
        return count;
    }


}

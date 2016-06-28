package com.Priyanka.headFirstJava.Chapter5;

/**
 * Created by Priyanka on 6/28/2016.
 */
public class arrayOfNumbers {
    private int num;
    private int[] numArr;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNumArr() {
        numArr = new int[3];
        for(int i=0; i<numArr.length; i++) {
            numArr[i] = num + i;
        }
    }

    public int[] getNumArr() {
        return numArr;
    }
}

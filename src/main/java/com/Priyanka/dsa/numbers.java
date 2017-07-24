package com.Priyanka.dsa;

/**
 * Created by prinks on 7/23/17.
 */
public class numbers {
    int[] tables3;
    int[] tables2;
    int count;

    public numbers(int[] tables3) {
        this.tables3 = tables3;
    }

    public int countEvenNumbers() {
        count = 0;
        for(int i=0;i<tables3.length;i++) {
            if((tables3[i]%2)==0) {
                count++;
            }
        }
        return count;
    }

    public int countOddNumbers() {
        count = 0;
        for(int i=0;i<tables3.length;i++) {
            if((tables3[i]%2)!=0) {
                count++;
            }
        }
        return count;
    }

    public int getElementFrom(int index) {
        return tables3[index];
    }

    public void setTables2(int[] multiplicationOf2) {
        this.tables2 = multiplicationOf2;
    }

    public int getNumberOfDuplicates() {
        count = 0;
        for(int i=0; i<tables3.length; i++) {
            for(int j=0; j<tables2.length; j++) {
                if(tables3[i]==tables2[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}

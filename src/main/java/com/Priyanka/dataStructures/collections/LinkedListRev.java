package com.Priyanka.dataStructures.collections;

/**
 * Created by prinks on 1/17/18.
 */
public class LinkedListRev {

    public int calcSum(Node n) {
        int sum = 0;
        int i = 0;
        while(i<3) {
            sum += n.val * Math.pow(10,i);
            i++;
            n = n.next;
        }
        return sum;
    }

    public int reverseNum(int number) {
        int reverseNumber = 0;
        int i = 2;
        while(i>=0) {
            reverseNumber += (number%10) * Math.pow(10,i);
            number = number/10;
            i--;
        }
        return reverseNumber;
    }

    public void addTwoNumbers(Node n1, Node n2) {
        int sum1;
        int sum2;
        int sum;
        int reverseSum;

        sum1 = calcSum(n1);
        System.out.println("Sum1: " + sum1);
        sum2 = calcSum(n2);
        System.out.println("Sum2: " + sum2);

        sum = sum1 + sum2;
        System.out.println("Total: " + sum);
        reverseSum = reverseNum(sum);
        System.out.println("ReverseSum: " + reverseSum);

    }
}

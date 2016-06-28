package com.Priyanka.headFirstJavaTests.Chapter5Tests;

import com.Priyanka.headFirstJava.Chapter5.arrayOfNumbers;
import com.Priyanka.headFirstJava.Chapter5.userGuess;

/**
 * Created by Priyanka on 6/28/2016.
 */
public class setOfNumsMatchTest {
    public static void main(String[] args) {
        int arrayIndexStart;
        int[] arrSet;
        int numUserGuessed;
        int numberOfGuesses;
        int flag;
        int numOfHits;
        int numOfMisses;
        int numOfMissesCount;

        arrayOfNumbers aon;
        userGuess ug;

        numOfMissesCount = 3;
        numberOfGuesses = 0;
        flag = 0;

        arrayIndexStart = (int) (Math.random() * 8);
        aon = new arrayOfNumbers();
        ug = new userGuess();
        System.out.println("Array Index Start: " + arrayIndexStart);

        aon.setNum(arrayIndexStart);
        aon.setNumArr();
        arrSet = aon.getNumArr();

        numOfHits = 0;
        while (flag == 0) {
            numOfMisses = 0;
            numUserGuessed = ug.askUserToGuess();
            numberOfGuesses++;
            for (int j = 0; j < arrSet.length; j++) {
                if (arrSet[j] == numUserGuessed) {
                    numOfHits++;
                    System.out.println("Hit!");
                    if (numOfHits == 1) {
                        int[] arrSetFirstHit = new int[2];
                        if (j == 0) {
                            arrSetFirstHit[0] = arrSet[j + 1];
                            arrSetFirstHit[1] = arrSet[j + 2];
                        } else if (j == 1) {
                            arrSetFirstHit[0] = arrSet[j - 1];
                            arrSetFirstHit[1] = arrSet[j + 1];
                        } else if (j == 2) {
                            arrSetFirstHit[0] = arrSet[j - 2];
                            arrSetFirstHit[1] = arrSet[j - 1];
                        }
                        arrSet = arrSetFirstHit;
                        numOfMissesCount = 2;
                    } else if (numOfHits == 2) {
                        int[] arrSetSecondHit = new int[1];
                        if (j == 0) {
                            arrSetSecondHit[0] = arrSet[j + 1];
                        } else if (j == 1) {
                            arrSetSecondHit[0] = arrSet[j - 1];
                        }
                        arrSet = arrSetSecondHit;
                        numOfMissesCount = 1;
                    } else if (numOfHits == 3) {
                        System.out.println("Kill");
                        System.out.println("The user got it right in " + numberOfGuesses + " guesses");
                        flag = 1;
                    }
                } else {
                    numOfMisses++;
                    if (numOfMisses == numOfMissesCount) {
                        System.out.println("Miss");
                    }
                }
            }
        }
    }
}


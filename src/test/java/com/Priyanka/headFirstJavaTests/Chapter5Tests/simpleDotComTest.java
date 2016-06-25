package com.Priyanka.headFirstJavaTests.Chapter5Tests;

import com.Priyanka.headFirstJava.Chapter5.guessNumbers;
import com.Priyanka.headFirstJava.Chapter5.simpleDotCom;

/**
 * Created by Priyanka on 6/24/2016.
 */
public class simpleDotComTest {
    public static void main(String[] args) {
        int flag = 0;
        int count = 0;
        int missedCount = 0;
        int i = -1;
        int actCount = 0;


        simpleDotCom simple = new simpleDotCom();
        int startIndex = (int) (Math.random() * 7);
        System.out.println("Start index: " + startIndex);
        int[] toGuessArr = {startIndex, startIndex + 1, startIndex + 2};
        simple.setNumArr(toGuessArr);
        while (flag == 0) {
            guessNumbers guessANum = new guessNumbers();
            guessANum.setNum();
            count++;

            for (i=0; i < simple.getNumArr().length; i++) {
                if (guessANum.getNum() == simple.getNumArr()[i]) {
                    System.out.println("Hit");
                    missedCount = 0;
                    flag = 1;
                    break;
                } else {
                    ++missedCount;
                    if (missedCount == 3) {
                        System.out.println("Miss");
                        missedCount = 0;
                    }
                }
            }
            if (flag == 1) {
                actCount++;
                System.out.println("You took " + count + " number of guesses to get one of the indices right");

                if(actCount==3) {
                    System.out.println("Kill. GAME OVER.");
                    flag = 1;
                } else
                    flag = 0;
            }

        }
    }
}
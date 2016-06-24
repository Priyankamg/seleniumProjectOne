package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.dotcom;
import com.Priyanka.headFirstJava.Chapter4.playerDotCom;

/**
 * Created by Priyanka on 6/24/2016.
 */
public class dotcomTest {
    public static void main(String[] args) {
        int[] actArr = new int[7];
        int flag = 0;
        int i;
        int stId = (int) (Math.random() * 7);
        System.out.println("Value of stId: " + stId);
        dotcom d = new dotcom();
        d.setDotcomarr(actArr);
        d.setStartIndex(stId);

        playerDotCom[] pDotCom = new playerDotCom[10];

        for(i=0; i<pDotCom.length; i++) {
            pDotCom[i] = new playerDotCom();
            pDotCom[i].setNum((int)(Math.random()*7));

            if(d.getStartIndex()==pDotCom[i].getNum()) {
                System.out.println("You got the first sequence number right");
                System.out.println("You got it when you tried for " + (i+1) + " times");
                System.out.println("The number is: " + pDotCom[i].getNum());
                i = pDotCom.length;
                flag = 1;
            }
        }

        if(flag==0 && i==pDotCom.length){
            System.out.println("Sorry. You did not get it right after " + pDotCom.length + " trials");
        }





    }
}

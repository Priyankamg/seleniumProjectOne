package com.Priyanka.headFirstJavaTests.Chapter11Tests;

import com.Priyanka.headFirstJava.Chapter11.tooColdException;
import com.Priyanka.headFirstJava.Chapter11.tooHotException;

import java.util.concurrent.TimeUnit;

/**
 * Created by Priyanka on 8/1/2016.
 */
public class hotChocolate {
    public static final double tooHot =  175;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws tooHotException,tooColdException{
        if(cocoaTemp >= tooHot) {
            throw new tooHotException();
        } else if(cocoaTemp <= tooCold) {
            throw new tooColdException();
        }
    }
    public static void main(String[] args) {
        double currentCocoaTemp = 170;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good");
                wrongTemp = false;
            } catch (tooHotException th) {
                System.out.println("Too Hot! Waiting for it to cool down by 10F");
                currentCocoaTemp -= 10;
            } catch (tooColdException tc) {
                System.out.println("Too Cold! Heating it so that the temp goes up by 10F");
                currentCocoaTemp += 10;
            }
//            finally {
//                System.out.println("Are we at the right hot chocolate temperature? ");
//            }
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
            System.out.println("And it's gone");

    }
}

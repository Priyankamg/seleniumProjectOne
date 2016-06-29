package com.Priyanka.headFirstJavaTests.Chapter5Tests;

/**
 * Created by Priyanka on 6/28/2016.
 */
public class multiForTest {
    public static void main(String[] args) {
        for(int x = 0; x < 4; x++) {
            for(int y=4; y>2; y--) {
                System.out.println(x + " " + y);
            }
            if(x==1){
                x++;
            }
        }
    }
}

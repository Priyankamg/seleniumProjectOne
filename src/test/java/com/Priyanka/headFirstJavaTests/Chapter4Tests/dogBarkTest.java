package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.dogBark;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class dogBarkTest {
    public static void main(String[] args) {
        dogBark dogOne = new dogBark();
        dogOne.size = 70;

        dogBark dogTwo = new dogBark();
        dogTwo.size = 5;

        dogBark dogThree = new dogBark();
        dogThree.size = 30;

        dogOne.bark();
        dogTwo.bark();
        dogThree.bark();
    }
}

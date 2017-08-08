package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.dogs;

/**
 * Created by prinks on 8/6/17.
 */
public class dogsTest {
    public static void main(String[] args) {
        dogs d1 = new dogs("Tommy",100);
        dogs d2 = new dogs("Timothy",50);
        dogs d3 = new dogs("Doggy",10);

        d1.bark();
        d2.bark();
        d3.bark();

    }
}

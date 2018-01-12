package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.PostfixToInfix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/11/18.
 */
public class PostfixToInfixTest {
    PostfixToInfix postfixToInfix;

    @Before
    public void initialize() {
        postfixToInfix = new PostfixToInfix();
    }

    @Test
    public void test1() {
        String input = "AB+C-";
        String output = postfixToInfix.convertPostfixToInfix(input);
        Assert.assertEquals("A+B-C",output);
    }

    @Test
    public void test2() {
        String input = "AB*C/";
        String output = postfixToInfix.convertPostfixToInfix(input);
        Assert.assertEquals("A*B/C",output);
    }

    @Test
    public void test3() {
        String input = "ABC*+";
        String output = postfixToInfix.convertPostfixToInfix(input);
        Assert.assertEquals("A+B*C",output);
    }

    @Test
    public void test4() {
        String input = "AB*C+";
        String output = postfixToInfix.convertPostfixToInfix(input);
        Assert.assertEquals("A*B+C",output);
    }

    @Test
    public void test5() {
        String input = "ABC+*";
        String output = postfixToInfix.convertPostfixToInfix(input);
        Assert.assertEquals("A*B+C",output);
    }

    @Test
    public void test6() {
        String input = "AB*CD*+";
        String output = postfixToInfix.convertPostfixToInfix(input);
        Assert.assertEquals("A*B+C*D",output);
    }

    @Test
    public void test7() {
        String input = "AB+CD-*";
        String output = postfixToInfix.convertPostfixToInfix(input);
        Assert.assertEquals("A+B*C-D",output);
    }

    @Test
    public void test8() {
        String input = "AB+C*D-";
        String output = postfixToInfix.convertPostfixToInfix(input);
        Assert.assertEquals("A+B*C-D",output);
    }

    @Test
    public void test9() {
        String input = "ABCDEF+/-*+";
        String output = postfixToInfix.convertPostfixToInfix(input);
        Assert.assertEquals("A+B*C-D/E+F",output);
    }
}

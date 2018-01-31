package com.Priyanka.dataStructuresTest.arraysTest;

import com.Priyanka.dataStructures.arrays.Palindrome;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/30/18.
 */
public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void initialize() {
        palindrome = new Palindrome();
    }

    @Test
    public void test1() {
        Assert.assertEquals(true, palindrome.isPalindrome("malayalam"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(false, palindrome.isPalindrome("rohan"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(true, palindrome.isPalindromeImp2("malayalam"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(false, palindrome.isPalindromeImp2("apple"));
    }
}

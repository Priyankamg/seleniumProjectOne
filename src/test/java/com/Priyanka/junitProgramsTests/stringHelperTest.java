package com.Priyanka.junitProgramsTests;

import com.Priyanka.simplePrograms.stringHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Priyanka on 6/17/2016.
 * Instead of creating an object of stringHelper class in each method,
 * we can create an object in the @Before. So, the object gets created before every test-case.
 * In the @After, we can assign that object to null. The object is then not referring to anything.
 */
public class stringHelperTest {
    stringHelper strHelperObj;

    @Before
    public void beforeMethod() {
        strHelperObj = new stringHelper();
    }

    @After
    public void afterMethod() {
        strHelperObj = null;
    }


    @Test
    public void testMethodTruncateAInFirstTwoPositions() {
        System.out.println("Test 1: testMethodTruncateAInFirstTwoPositions");
        //stringHelper strHelperObj = new stringHelper();
        assertEquals("PBCDE",strHelperObj.truncateAFirst2Positions("PABCDE"));
        assertEquals("BCDE",strHelperObj.truncateAFirst2Positions("AABCDE"));
        assertEquals("GH",strHelperObj.truncateAFirst2Positions("AaGH"));
        assertEquals("",strHelperObj.truncateAFirst2Positions("aa"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame() {
        System.out.println("Test 2: testAreFirstAndLastTwoCharactersTheSame");
        //stringHelper strHelperObj = new stringHelper();
        assertTrue(strHelperObj.areFirstLast2CharsSame("MMM"));
        assertTrue(strHelperObj.areFirstLast2CharsSame("A"));
        assertTrue(strHelperObj.areFirstLast2CharsSame("pg"));
        assertFalse(strHelperObj.areFirstLast2CharsSame("PQP"));
        assertTrue(strHelperObj.areFirstLast2CharsSame("lmabcdelm"));
        assertTrue(strHelperObj.areFirstLast2CharsSame(""));
        assertTrue(true);
        assertFalse(false);
    }
}

package com.Priyanka.simpleProgramsTests;

import com.Priyanka.simplePrograms.areFirstAndLastTwoCharactersTheSame;
import com.Priyanka.simplePrograms.truncateAInFirstTwoPositions;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Priyanka on 6/17/2016.
 */
public class simpleProgramsTest {

    @Before
    public void beforeMethod() {
        System.out.println("The keyword @Before will execute the code in this method before every test case");
    }

    @After
    public void afterMethod() {
        System.out.println("The keyword @After will execute the code in this method after every test case");
    }

    @BeforeClass
    public static void beforeClassMethod() {
        System.out.println("The keyword @BeforeClass is for the entire class and not for every test. It gets executed once before the first test in that class");
    }

    @AfterClass
    public static void afterClassMethod() {
        System.out.println("The keyword @AfterClass is for the entire class and not for every test. It gets executed once after the last test in that class");
    }

    @Test
    public void testMethodTruncateAInFirstTwoPositions() {
        System.out.println("Test 1: testMethodTruncateAInFirstTwoPositions");
        truncateAInFirstTwoPositions objTruncateA = new truncateAInFirstTwoPositions();
        assertEquals("PBCDE",objTruncateA.truncateAFirst2Positions("PABCDE"));
        assertEquals("BCDE",objTruncateA.truncateAFirst2Positions("AABCDE"));
        assertEquals("GH",objTruncateA.truncateAFirst2Positions("AaGH"));
        assertEquals("",objTruncateA.truncateAFirst2Positions("aa"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame() {
        System.out.println("Test 2: testAreFirstAndLastTwoCharactersTheSame");
        areFirstAndLastTwoCharactersTheSame objCompareFirstLastTwoChars = new areFirstAndLastTwoCharactersTheSame();
        assertTrue(objCompareFirstLastTwoChars.areFirstLast2CharsSame("MMM"));
        assertTrue(objCompareFirstLastTwoChars.areFirstLast2CharsSame("A"));
        assertTrue(objCompareFirstLastTwoChars.areFirstLast2CharsSame("pg"));
        assertFalse(objCompareFirstLastTwoChars.areFirstLast2CharsSame("PQP"));
        assertTrue(objCompareFirstLastTwoChars.areFirstLast2CharsSame("lmabcdelm"));
        assertTrue(objCompareFirstLastTwoChars.areFirstLast2CharsSame(""));
    }
}

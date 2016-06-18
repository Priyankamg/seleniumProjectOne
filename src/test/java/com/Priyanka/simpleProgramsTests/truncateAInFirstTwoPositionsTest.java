package com.Priyanka.simpleProgramsTests;

import com.Priyanka.simplePrograms.truncateAInFirstTwoPositions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Priyanka on 6/17/2016.
 */
public class truncateAInFirstTwoPositionsTest {

    @Test
    public void testMethodTruncateAInFirstTwoPositions() {
        truncateAInFirstTwoPositions objTruncateA = new truncateAInFirstTwoPositions();
        assertEquals("PBCDE",objTruncateA.truncateAFirst2Positions("PABCDE"));
        assertEquals("BCDE",objTruncateA.truncateAFirst2Positions("AABCDE"));
        assertEquals("GH",objTruncateA.truncateAFirst2Positions("AaGH"));
        assertEquals("",objTruncateA.truncateAFirst2Positions("aa"));
    }
}

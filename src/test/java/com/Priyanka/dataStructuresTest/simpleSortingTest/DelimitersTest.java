package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.Delimiters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/7/18.
 */
public class DelimitersTest {
    Delimiters delimiters;

    @Before
    public void initialize() {
        delimiters = new Delimiters();
    }

    @Test
    public void testClosedBracket() {
        Assert.assertEquals(true, delimiters.checkDelimiters("a[b]"));
    }

    @Test
    public void testIncorrectClosingDelimiter() {
        Assert.assertEquals(false, delimiters.checkDelimiters("C{om[po)"));
    }

    @Test
    public void testNoClosingDelimiter() {
        Assert.assertEquals(false, delimiters.checkDelimiters("al(ph{abe[ts"));
    }

    @Test
    public void testAllClosingDelimiters() {
        Assert.assertEquals(true, delimiters.checkDelimiters("a{l[p(ha)b]et}s"));
    }

    @Test
    public void testExtraClosingParenthesis() {
        Assert.assertEquals(false,delimiters.checkDelimiters("ni{nco[(mpoop)]}}"));
    }
}

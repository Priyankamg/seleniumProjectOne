package com.Priyanka.testSuite;

import com.Priyanka.pageObjectsTests.bestSellersTest;
import com.Priyanka.pageObjectsTests.booksForChildrenTest;
import com.Priyanka.pageObjectsTests.novelPageTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Priyanka on 7/1/2016.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        bestSellersTest.class,
        booksForChildrenTest.class,
        novelPageTest.class
})
public class booksTestSuite {
}


package com.Priyanka.pageObjectsFactoryTests;

import com.Priyanka.pageObjectsfactory.homePage;
import org.junit.Test;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class aSimpleTest extends abstractDriverTest {

    @Test
    public void navigateBackAndForth() {
        homePage onHomePage = new homePage(driver);
        onHomePage
                .navigateToWebApp()
                .navigateToVaseline()
                .navigateToHomePage();
    }
}

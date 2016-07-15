package com.Priyanka.junitProgramsTests;

import com.Priyanka.util.propertyManager;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by Priyanka on 7/14/2016.
 */
public class abstractHeadlessDriverTest {
    protected HtmlUnitDriver driver;
    protected propertyManager config;

    @Before
    public void setUp() {
        driver  = new HtmlUnitDriver(BrowserVersion.CHROME);
        config = new propertyManager();
    }

    @After
    public void shutDown() {
        driver.close();
    }


}

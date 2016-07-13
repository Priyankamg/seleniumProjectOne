package com.Priyanka.junitProgramsTests;

import com.Priyanka.util.propertyManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Priyanka on 7/11/2016.
 */
public class abstractDriverTest {
    protected WebDriver driver;
    protected propertyManager config;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver","src/main/java/com/Priyanka/webDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        config = new propertyManager();

    }

    @After
    public void testShutDown() {
        driver.close();
    }
}

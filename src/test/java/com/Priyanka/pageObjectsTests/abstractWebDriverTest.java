package com.Priyanka.pageObjectsTests;

import com.Priyanka.pageObjects.homePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Priyanka on 7/1/2016.
 */
public class abstractWebDriverTest {
    protected WebDriver driver;
    protected homePage onHomePage;

    @Before
    public void setup() {
        System.out.println("Before in Abstract");
        System.setProperty("webdriver.chrome.driver","src/main/java/com/Priyanka/webDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void shutDown() {
        System.out.println("After in Abstract");
        System.out.println("--");
        driver.close();
    }

}

package com.Priyanka.launchBrowsers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by Priyanka on 6/27/2016.
 */
public class implementBeforeAfterBasicTest {
    private WebDriver driver;

    @Before
    public void initializeDriver() {
        System.setProperty("webdriver.firefox.bin","src/main/java/com/Priyanka/Firefox42/Mozilla Firefox/firefox.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void  goToUrlAndSearch() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 6");
        driver.findElement(By.className("nav-input")).click();
        String titleOfPage = driver.getTitle();
        assertEquals("Amazon.com: iphone 6: Cell Phones & Accessories",titleOfPage);
}

    @After
    public void closeBrowser() {
        driver.close();
    }

}
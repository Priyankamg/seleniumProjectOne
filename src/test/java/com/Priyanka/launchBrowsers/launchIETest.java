package com.Priyanka.launchBrowsers;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by Priyanka on 6/17/2016.
 */
public class launchIETest {
    @Test
    public void launchIEBrowser() {
        //System.setProperty("webdriver.ie.driver","C:\\webDrivers\\IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver","src/main/java/com/Priyanka/webDrivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.amazon.com");
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell");
            driver.findElement(By.className("nav-input")).click();
            String titleOfPage = driver.getTitle();
            assertEquals("Amazon.com: Dell - Computers & Tablets / Computers & Accessories: Electronics", titleOfPage);
        } catch (WebDriverException we) {
            we.printStackTrace();
        }
        driver.close();
        driver.quit();
    }
}

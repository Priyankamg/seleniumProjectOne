package com.Priyanka.launchBrowsers;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by Priyanka on 6/16/2016.
 */
public class launchChromeTest {
    @Test
    public void startChrome() {
        //System.setProperty("webdriver.chrome.driver","C:\\webDrivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","src/main/java/com/Priyanka/webDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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

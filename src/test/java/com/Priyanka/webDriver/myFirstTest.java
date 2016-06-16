package com.Priyanka.webDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Priyanka on 6/16/2016.
 */
public class myFirstTest {
    @Test
    public void startWebDriver() {
        System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://www.flipkart.com/");
            driver.findElement(By.className("LM6RPg")).sendKeys("Dell");
            driver.findElement(By.className("vh79eN")).click();
        } catch (WebDriverException we) {
            System.out.println("--- WebDriver Exception  ---");
            we.printStackTrace();
        }
        driver.close();
        driver.quit();
    }
    
}

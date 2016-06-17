package com.Priyanka.webDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Priyanka on 6/16/2016.
 */
public class launchChromeTest {
    @Test
    public void startChrome() {
        System.setProperty("webdriver.chrome.driver","C:\\webDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.amazon.com");
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell");
            driver.findElement(By.className("nav-input")).click();
        } catch (WebDriverException we) {
            we.printStackTrace();
        }
        driver.close();
        driver.quit();
    }
}

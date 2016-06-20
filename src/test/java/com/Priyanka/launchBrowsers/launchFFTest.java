package com.Priyanka.launchBrowsers;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Priyanka on 6/16/2016.
 */
public class launchFFTest {
    @Test
    public void startWebDriver() {
        System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        try {
            driver.manage().window().maximize();     // Used to maximise windows
                                                     // Some elements of web page are hidden if the window
                                                     // is not maximized. In order to avoid that, it is always
                                                     // a good practice to maximise the window.
            driver.get("https://www.amazon.com/");   // Navigate to Specific URL

            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell");
            driver.findElement(By.className("nav-input")).click();
        } catch (WebDriverException we) {
            System.out.println("--- WebDriver Exception  ---");
            we.printStackTrace();
        }
        driver.close();
        driver.quit();
    }

}

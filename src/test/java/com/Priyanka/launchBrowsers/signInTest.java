package com.Priyanka.launchBrowsers;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Priyanka on 6/27/2016.
 */
public class signInTest {
    @Test
    public void testForSignIn() {
        System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        try {
            driver.manage().window().maximize();
            driver.navigate().to("https://www.amazon.com"); // navigate().to is same as get. Need to understand the differences.
            driver.findElement(By.id("nav-link-yourAccount")).click();
            driver.findElement(By.id("ap_email")).sendKeys("priyankamg.test@gmail.com");
            driver.findElement(By.id("ap_password")).sendKeys("karu5%99");
            driver.findElement(By.id("signInSubmit")).click();
        } catch (WebDriverException we) {
            we.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.close();
        driver.quit();
    }
}

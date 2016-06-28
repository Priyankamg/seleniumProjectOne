package com.Priyanka.launchBrowsers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Priyanka on 6/27/2016.
 */
public class beforeAfterMultipleTests {

    private WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver","src/main/java/com/Priyanka/webDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
    }

    @After
    public void testShutDown() {
        driver.close();
    }

    @Test
    public void searchForIphone() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 6");
        driver.findElement(By.className("nav-input")).click();
        Assert.assertEquals("Amazon.com: iphone 6: Cell Phones & Accessories",driver.getTitle());
    }

    @Test
    public void signInToAccount() {
        driver.findElement(By.id("nav-link-yourAccount")).click();
        driver.findElement(By.id("ap_email")).sendKeys("priyankamg.test@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("karu5%99");
        driver.findElement(By.id("signInSubmit")).click();
        Assert.assertEquals("Hello, priyankamg\nYour Account",driver.findElement(By.id("nav-link-yourAccount")).getText());
    }
}

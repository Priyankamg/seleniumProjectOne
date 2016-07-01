package com.Priyanka.pageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class abstractPage {

    protected WebDriver driver; // Protected - Methods can access this.
                                // Classes that extend this class can access this.

    public abstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public homePage navigateToWebApp() {
        driver.navigate().to("https://www.amazon.com/");
        return new homePage(driver);
    }
}

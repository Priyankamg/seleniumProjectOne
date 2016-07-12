package com.Priyanka.pageObjectsfactory;

import com.Priyanka.util.propertyManager;
import org.openqa.selenium.WebDriver;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class abstractPage {
    protected WebDriver driver;
    propertyManager config;


    public abstractPage(WebDriver driver) {
        this.driver = driver;
        config = new propertyManager();
        config.setProperties();
    }

    public homePage navigateToWebApp() {
        driver.navigate().to(config.getWebAppUrl());
        return new homePage(driver);
    }
}

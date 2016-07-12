package com.Priyanka.pageObjectsfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class vaselinePage extends abstractPage {
    public vaselinePage(WebDriver driver) {
        super(driver);
    }
    public homePage navigateToHomePage() {
        driver.navigate().to(config.getWebAppUrl());
        return PageFactory.initElements(driver,homePage.class);
    }
}

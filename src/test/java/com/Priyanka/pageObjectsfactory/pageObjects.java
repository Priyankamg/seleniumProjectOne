package com.Priyanka.pageObjectsfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class pageObjects {

    @FindBy(how= How.CSS, using = "#twotabsearchtextbox")
    protected WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "nav-input")
    protected WebElement searchIcon;

    @FindBy(css="[class='a-color-state a-text-bold']")
    protected WebElement searchResult;

}

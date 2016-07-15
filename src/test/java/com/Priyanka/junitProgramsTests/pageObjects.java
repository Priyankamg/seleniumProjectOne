package com.Priyanka.junitProgramsTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Priyanka on 7/14/2016.
 */
public class pageObjects {

    @FindBy(id="twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(className="nav-input")
    WebElement searchIcon;

    @FindBy(css="[class='a-color-state a-text-bold']")
    WebElement titleOfProductAfterSearch;

}

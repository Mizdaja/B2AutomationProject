package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Set;

public class SmartBearSoftwareLoadingPage {

    @FindBy (id = "ctl00_MainContent_username" )
    public WebElement username;

    @FindBy (id = "ctl00_MainContent_password" )
    public WebElement password;

    @FindBy (id = "ctl00_MainContent_login_button" )
    public WebElement loginButton;

    @FindBy (tagName = "a")
    public List<WebElement> link;

    public SmartBearSoftwareLoadingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

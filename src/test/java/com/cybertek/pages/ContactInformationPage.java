package com.cybertek.pages;

import com.cybertek.tests.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformationPage extends TestBase {

    @FindBy(className = "user-name")
    public WebElement contactFullName;

    @FindBy(css  ="a.phone")
    public WebElement phone;

    @FindBy(css  ="a.email")
    public WebElement email;
}

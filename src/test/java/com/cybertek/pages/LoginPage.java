package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {    //constructor
        PageFactory.initElements(Driver.get(), this);   // this line guarantees that everybody will get the same object
    }

    @FindBy(id="prependedInput")      // provide the locator information. used to find the element.
    public WebElement username;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy (id="_submit")
    public WebElement submit;

    public void login (String usernamestr, String passwordStr) {
        username.sendKeys((usernamestr));
        password.sendKeys(passwordStr);
        submit.click();
    }
/*@FindBys ({
    @FindBy(id="abc");
    @FindBy (name="abc")}]   useful in finding dynamic elements

  @FindBys : When the required WebElement objects need to match all of the given criteria use @FindBys annotation
@FindAll : When required WebElement objects need to match at least one of the given criteria use @FindAll annotation
 */

}
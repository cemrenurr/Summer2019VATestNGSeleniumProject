package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactsPage extends BasePage{

    public WebElement getContactEmail (String email) {
        String xpath= "/*[contains(text(), 'mbrackstone9@example.com’) and @data-column-label=‘Email’]";
        return Driver.get().findElement(By.xpath(xpath));
    }

}

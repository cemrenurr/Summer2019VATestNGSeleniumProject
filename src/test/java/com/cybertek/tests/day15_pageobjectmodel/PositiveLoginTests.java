package com.cybertek.tests.day15_pageobjectmodel;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTests extends TestBase {

    @Test
    public void loginAsDriver () {
        LoginPage loginPage=new LoginPage();
        loginPage.username.sendKeys("user2");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");
    }
    @Test
    public void loginAsStoreManager () {
        LoginPage loginPage=new LoginPage();
        loginPage.login("user2", "UserUser123");
        loginPage.submit.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");
    }
}

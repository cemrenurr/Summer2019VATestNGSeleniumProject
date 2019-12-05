package com.cybertek.tests.day15_pageobjectmodel;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {

    @Test
    public void wrongPasswordTest() {
        LoginPage loginPage=new LoginPage();
        loginPage.username.sendKeys("salesmanager101");
        loginPage.password.sendKeys("1234");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");

    }

    @Test
    public void wrongUsernameTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.username.sendKeys("superadmin");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");

    }

}

package com.cybertek.tests.d16_pom2;

import com.cybertek.pages.DashBoardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitlesTest extends TestBase {
    @Test
    public void verifySubTitleTest(){
        LoginPage loginPage= new LoginPage();
        String username= ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");
        loginPage.login(username, password);

        DashBoardPage dashBoardPage= new DashBoardPage();
        String actual= dashBoardPage.getPageSubTitle();

        Assert.assertEquals(actual, "Quick Launchpad");

    }
}

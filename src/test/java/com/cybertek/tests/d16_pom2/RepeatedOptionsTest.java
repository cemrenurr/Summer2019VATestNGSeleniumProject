package com.cybertek.tests.d16_pom2;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashBoardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class RepeatedOptionsTest {
    @Test
    public void Test() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username,password);
        DashBoardPage dashBoardPage= new DashBoardPage();
        dashBoardPage.navigateToModule("Activities", "Calendar Events");

        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
        //calendarEventsPage.waitUntilLoaderScreen
        calendarEventsPage.createCalendarEvent.click();

    }

}
package com.cybertek.tests.assignments;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testcases_3 extends TestBase {

    @Test
    public void test1() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("store_manager_username"), ConfigurationReader.get("store_manager_password"));


        WebElement activities= driver.findElement(By.xpath("//a//span//i[@class='fa-puzzle-piece menu-icon']"));
        //actions.moveToElement(activities).perform();

    }
}
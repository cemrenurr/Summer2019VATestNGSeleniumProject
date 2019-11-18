package com.cybertek.tests.assignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vytrack {
    /*
    Go to the login page of VyTrack •
    Enter valid credential (can be any role)•
    Click login button •
    Verify that the user login successfully

     */
    public static void main(String[] args) throws InterruptedException {
        //    Go to the login page of VyTrack
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");

        //    Enter valid credential (can be any role)
        WebElement username=driver.findElement(By.name("_username"));
        username.sendKeys("storemanager63");
        WebElement password= driver.findElement(By.name("_password"));
        password.sendKeys("UserUser123");

        //Click login button
        WebElement login= driver.findElement(By.id("_submit"));
        login.click();

        //    Verify that the user login successfully
        String title= driver.getTitle();
        String titleexpected= "Dashboard";

        //assertion
        if (title.equals(titleexpected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        Thread.sleep(3000);
        driver.quit();

    }
}

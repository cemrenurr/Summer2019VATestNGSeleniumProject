package com.cybertek.tests.assignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task6 {
    /*
    Test case #6


    Step 7. Click Sign Up
    Step 8. Verify that following message is displayed: “Thank you for signing up. Click the button below to return to the home page.”
    Step 9. Navigate back to the “https://www.tempmailaddress.com/”
    Step 10. Verify that you’ve received an email from “do-not-reply@practice.cybertekschool.com”
    Step 11. Click on that email to open it.
    Step 12. Verify that email is from: “do-not-reply@practice.cybertekschool.com”Step 13. Verify that subject is: “Thanks for subscribing to practice.cybertekschool.com!”
     */
    WebDriver driver;

    @BeforeMethod
    public void Before() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.tempmailaddress.com/");

    }

    @AfterMethod
    public void After() {
        driver.close();
    }



}

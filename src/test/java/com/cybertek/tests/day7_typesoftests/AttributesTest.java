package com.cybertek.tests.day7_typesoftests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributesTest {

    @Test
    public void Test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement bluebutton = driver.findElement(By.id("blue"));
        System.out.println(bluebutton.getAttribute("id"));
    }
}
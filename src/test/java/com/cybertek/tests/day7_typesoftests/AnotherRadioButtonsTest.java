package com.cybertek.tests.day7_typesoftests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnotherRadioButtonsTest {
    @Test
    public void Test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement basketball = driver.findElement(By.id("basketball"));
        WebElement football = driver.findElement(By.id("football"));

        Assert.assertFalse(basketball.isSelected()); // we are sure that basketball is not selected, so we are checking it with test.
    }
}

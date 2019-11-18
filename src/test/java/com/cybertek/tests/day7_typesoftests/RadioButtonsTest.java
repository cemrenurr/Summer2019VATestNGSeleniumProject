package com.cybertek.tests.day7_typesoftests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTest {

    /*
    Type of elements only one can be selected. in a group of options, only ome can be selected.
    Some have default selection and some does not have.
     */

    @Test
    public void Test1() {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blue= driver.findElement(By.id("blue"));
        WebElement red= driver.findElement(By.id("red"));

        System.out.println("is blue selected " + blue.isSelected());
        // this is not testing and testNg does not take system.out into consideration
       // red.click();
        //verify if blue is selected
        Assert.assertTrue(blue.isSelected());       // this part is proper way of testing
        // verify if red is not selected
        Assert.assertFalse(red.isSelected());
    }
}

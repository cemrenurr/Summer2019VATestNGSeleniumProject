package com.cybertek.tests.day7_typesoftests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest {
    /*
    Checkbox: type of a input element which can be selected or unselected.
              when we have a group of checkboxes, unselecting one checkbox does not affect others' selection.


     */
    @Test
    public void Test1(){

    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1= driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2= driver.findElement(By.xpath("//input[2]"));

        checkbox1.click();
        checkbox2.click();
        checkbox1.click();

        //verify checkbox is not selected
        Assert.assertFalse(checkbox1.isSelected());

//        checkbox2.click();
//        //verify check2 is not selected
//        Assert.assertFalse(checkbox2.isSelected());
}
}

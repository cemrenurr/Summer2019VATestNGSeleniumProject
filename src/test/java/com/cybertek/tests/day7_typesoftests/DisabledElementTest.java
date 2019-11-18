package com.cybertek.tests.day7_typesoftests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DisabledElementTest {
    @Test
    public void Test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement green= driver.findElement(By.id("green"));
        System.out.println("is green enabled?" + green.isEnabled());

        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement element= driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println("is element disabled?"+ element.isEnabled());
        element.sendKeys("gff");

        //ElementNotInteractableException: when the element is disabled
    }
}

package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.manage().window().maximize();        // maximizing the window
        driver.manage().window().fullscreen();      //making the window fullscreen (does not work in Windows)

        //BUTTON3: <button class="btn btn-primary" onclick="button3()" id="button_cool">Button 3</button>
        //                                                              ^^has an ID ^^
        // WebElement element3=driver.findElement(By.id("button_cool"));
        //  element3.click();

        WebElement element = driver.findElement(By.id("button_three"));
        element.click();
        String txt = element.getText();
        System.out.println(txt);
        driver.quit();
        /* When locator is wrong, "NoSuchElementException" error shows in console.
         Then, we have to check the id locator.
         Sometimes, there are dynamic id locators on websites for different purposes.
         We understand if the website is dynamic, once we test it.
         */



    }
}

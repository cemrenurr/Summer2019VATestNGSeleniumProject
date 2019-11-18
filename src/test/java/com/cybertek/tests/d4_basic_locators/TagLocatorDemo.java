package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagLocatorDemo {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        //WebElement fullName= driver.findElement(By.tagName("input"));

        // the one that is closest to the name is tagName.Selenium use as tag to the tag.

        /*<input type="text" name="full_name">
                    ^^^^^ tagName
            search if there is more than one same tag: command+f
         */
        //WebElement submit= driver.findElement(By.tagName("button"));
        //submit.click();
        WebElement home=driver.findElement(By.className("nav-link"));
        home.click();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement title= driver.findElement((By.className("h3")));
        System.out.println(title.getText());
        //if a class has a space in it, we cannot use it.


    }
}

package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement element= driver.findElement(By.name("full_name"));
        /*
        if element is found-> returns the web element
        if element not found -> NoSuchElementException
         */
       element.sendKeys("Cemrenur Topuz");
        WebElement element2= driver.findElement(By.name("email"));
        element2.sendKeys("cemre.topuz@gmail.com");
        WebElement element3= driver.findElement(By.name("wooden_spoon"));
        element3.click();

        //id is more unique tha

}}

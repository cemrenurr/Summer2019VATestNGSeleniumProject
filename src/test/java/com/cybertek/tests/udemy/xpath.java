package com.cybertek.tests.udemy;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xpath {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("CHROME");
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("cemre_topuz@yahoo.com");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Marmara2212");
        driver.findElement(By.xpath("//button[@name='login']")).click();


    }
}

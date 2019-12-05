package com.cybertek.tests.day12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesPractice {
    WebDriver driver;



    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
       driver.get("http://practice.cybertekschool.com/frames");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }
    @Test (description = "iframe example")
    public void test1() {
      driver.findElement(By.linkText("iFrame")).click();
      driver.switchTo().frame("mce_0_ifr");
     WebElement inputarea= driver.findElement(By.id("tinymce"));
     inputarea.clear();
     inputarea.sendKeys("java is fun");
    }
    @Test
    public void test2() {
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame(driver.findElement(By.name("frame-bottom")));
        System.out.println(driver.findElement(By.tagName("body")).getText());
        //driver.switchTo().frame()
    }

    @Test
    public void test3 () {
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame(driver.findElement(By.name("frame-top")));
        driver.switchTo().frame(driver.findElement(By.name("frame-left")));
        System.out.println(driver.findElement(By.tagName("body")).getText());

    }
}

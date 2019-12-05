package com.cybertek.tests.day12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {
    WebDriver driver;
    Actions actions;


    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        actions=new Actions(driver);

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }

    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img= driver.findElement(By.tagName("img"));
        actions.moveToElement(img).perform();
    }
    @Test
    public  void test2 () {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement draggable= driver.findElement(By.id("draggable"));
        WebElement droptarget= driver.findElement(By.id("droptarget"));
        actions.dragAndDrop(draggable,droptarget).perform();


    }
}
package com.cybertek.tests.d13_tables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesExamples {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
        @Test
        public void test1(){
            driver.get("http://practice.cybertekschool.com/tables");
            WebElement table = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]//td"));
            System.out.println(table.getText());

        }
}
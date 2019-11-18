package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLChanged {
    /*
    Verify URL changed
        open browser
        go to http://practice.cybertekschool.com/forgot_password
        enter any email
        click on Retrieve password
        verify that url changed to http://practice.cybertekschool.com/email_sent
     */
    public static void main(String[] args) {
        //  1.open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        // 2. go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. enter any email
            // 3.1. find the element
        WebElement emailInput= driver.findElement(By.name ("email"));
            //3.2. enter given text
        emailInput.sendKeys("admiralkunkka@email.com");

        //4. click on Retrieve password
        WebElement retrievePassword= driver.findElement(By.id ("form_submit"));
        retrievePassword.click();

        // 5.verify that url changed to http://practice.cybertekschool.com/email_sent
        String expected= "http://practice.cybertekschool.com/forgot_password";
        String actual= driver.getCurrentUrl();


        if (expected.equals(actual)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
    //CLOSE the browser
        driver.quit();
    }

}

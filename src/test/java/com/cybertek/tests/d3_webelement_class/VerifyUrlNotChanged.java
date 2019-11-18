package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlNotChanged {
    /**
     * Manual testing:
     * Verify URL not changed
     * open chrome browser
     * go to http://practice.cybertekschool.com/forgot_password
     * click on Retrieve password
     * verify that url did not change
     */

    public static void main(String[] args) {

        //OPEN CHROME BROWSER
        WebDriver driver= WebDriverFactory.getDriver("chrome");


        //GO TO THE URL
        driver.navigate().to("http://practice.cybertekschool.com/forgot_password");

        //SAVE THE EXPECTED URL
        String expectedURL= driver.getCurrentUrl();

        //CLICK ON RETRIEVE PASSWORD
        WebElement retrievePassword=driver.findElement(By.id ("form_submit"));
        retrievePassword.click();

        String actualURL= driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }





        /*
        CapitalLetters-> class
        Class related to whole browser: WebDriver
        Everything on the page: Element
        Class that represents elements from the webpage (inside the page): WebElement
        How to import a class-> option+enter



         */
        // to find element in a page: everything on page is seen as element.
        //everything in a page is found in WebElement class/
        // Webelement: class that represents elements from the webpage.
        // findelement : method used to find element on a page







    }
}

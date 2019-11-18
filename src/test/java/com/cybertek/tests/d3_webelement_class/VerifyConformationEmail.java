package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConformationEmail {
    public static void main(String[] args) {

        // open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //  enter any email
        WebElement emailInput= driver.findElement(By.name("email"));
        String expectedEmail= "admiralkunkka@email.com";
        emailInput.sendKeys("admiralkunkka@email.com");
        // verify that email is displayed in the input box
        // .getAttribute("value")  --> get text from the input box
        String actualEmail=emailInput.getAttribute("value");
        // click on Retrieve password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        if (expectedEmail.equals(actualEmail)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedEmail = " + expectedEmail);
            System.out.println("actualEmail = " + actualEmail);
        }



        // verify that confirmation message says 'Your e-mail's been sent!'

        String expectedMessage = "Your e-mail's been sent!";
       //locating the message on the page
        WebElement messageElement = driver.findElement(By.name("confirmation_message"));
        String actualMessage = messageElement.getText();

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        driver.quit();
    }

}

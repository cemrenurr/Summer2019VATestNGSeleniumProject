package com.cybertek.tests.assignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.lang.String;

public class Vytrack2 {
    /*
    Go to the login page of VyTrack
    •Enter invalid credential (can be any role)•
    Click login button •
    Verify that the system shows error message “Invalid user name or password.”
     */
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement username= driver.findElement(By.id("prependedInput"));
        username.sendKeys("storemanager63");
        WebElement password= driver.findElement(By.id("prependedInput2"));
        password.sendKeys("12345");
        WebElement login= driver.findElement(By.name("_submit"));
        login.click();
        WebElement message= driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]/div"));
        
        //WebElement mes= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/form/fieldset/div[1]/div"));
       String actual= message.getText();
       String expected= "Invalid user name or password.";
        //System.out.println(actual);
        String result= (actual.equals(expected)) ? "pass" :"fail";
        System.out.println(result);
        driver.quit();


    }
}
//by id->by name->css or xpath (css is faster than xpath)
//put cursor on a method + command -> shows where the method comes from
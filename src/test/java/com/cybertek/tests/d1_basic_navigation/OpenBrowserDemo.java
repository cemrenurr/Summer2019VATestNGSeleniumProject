package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
if there is a letter in the name of the dependency, it means it is still updating/testing-not there yet.

 */
public class OpenBrowserDemo {
    public static void main (String [] args) {

        // to import: option +enter
        // we have to enter this line everytime we want to open chrome.
        WebDriverManager.chromedriver().setup();

        /*
        this part is selenium
         WebDriver -> represents browser
         this line opens chrome browser
        */

        WebDriver driver= new ChromeDriver();

    }
}

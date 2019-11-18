package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get ("http://practice.cybertekschool.com/");
        //close() -> close the current tab/windows
        Thread.sleep(5000);
        driver.close();     // closed the browser

        driver= new ChromeDriver();         // we have to open a new browser again.
        driver.get("http://practice.cybertekschool.com/open_new_tab");  // opens the page in new tab
        Thread.sleep(5000);
        //driver.close();

        //quit () => close all open windows and tabs and everything else.
        driver.quit();
    }
}

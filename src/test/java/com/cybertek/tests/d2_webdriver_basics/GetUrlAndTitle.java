package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitle {
    public static void main(String[] args) {
        //Setup the browser
        WebDriverManager.chromedriver().setup();
        // open chrome browser
        WebDriver driver= new ChromeDriver();
        driver.get( "http://practice.cybertekschool.com/");
        //get the title of the page
        String title=driver.getTitle();
        System.out.println("title =" +title);
        //getCurrentURL() -> get URL of the page
        String url = driver.getCurrentUrl();
        System.out.println("url =" +url);
        //getPageSource () -->
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
    }
}

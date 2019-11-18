package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekschool.com/"); // get -> waits for page to load
        System.out.println(driver.getTitle());


        //Thread.sleep(1);
        driver.navigate().to("https://www.amazon.com/"); // navigate -> does not wait for page to load
        System.out.println(driver.getTitle());

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

}

package com.cybertek.tests.d5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
Locators: There are 8 locators in selenium;
1.Id
2.Name
3.ClassName
4.TagName
5.LinkText
6.Partial Link Text
7.xpath                 \    xpath and css are custom locators with certain syntax.
8.css locator           /

XPATH
it is a unique way of finding element on HTML page.
Xpath navigates through the html to find element based on the description we provide.

Absolute xpath:
starts with single slash, it starts looking for elements from the root of the html documents.

Relative xpath: starts with 2 slash.
//li/a      =>   find any li element on the page, then find its child a
                 This xpath uses parent/child relationship
//h3         => find any h3 element on the page

What does double slash mean? if it is in the beginning of the xpath, it looks anywhere in the page if the slash is in the middle it means any descendant
//body//h3   => find any body element on the page

//button[@onclick='button1()']  : tag with a special attribute

Certain element with exact text;
//nameofthetag[.='text']

Certain element with partial text
//E[contains(text(), 't')]        =>    //button[contains(text(), 'Button 1')]

Finding Dynamic Elements Using Xpath
//button[starts-with (@A, 't')]
//button[ends-with(@id,'_button')] : does not work on chrome, works on ff, ie

contains
//E[contains(@A, 't')]
//button [contains(@id, 'button_')]

index
index based on nth siblings
//E[Index]
in html count starts from 1.
//button [2] => give me the second button

index of matches
if i want to find from list of matches, but they do not have the same parent.
1, Write xpath


 */
    public class XpathTestDemoClass {
        public static void main(String[] args) {
            WebDriver driver= WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get("http://practice.cybertekschool.com/multiple_buttons");
            WebElement link= driver.findElement(By.xpath("/html/body/nav/ul/li/a"));        //home button
            System.out.println(link.getText());
            WebElement text= driver.findElement(By.xpath("/html/body/div/div/div/div/h3"));  //multiple buttons
            System.out.println(text.getText());
            WebElement text2=driver.findElement(By.xpath("//li/a"));                    //Home button
            System.out.println(text2.getText());
        }

}

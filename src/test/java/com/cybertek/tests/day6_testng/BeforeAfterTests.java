package com.cybertek.tests.day6_testng;

import org.testng.annotations.*;

public class BeforeAfterTests {

    @Test
    public void Tests (){
        System.out.println("This is test one");
    }
    @Test
    public void Tests2 (){
        System.out.println("This is second one");
    }


    // beforeMethod and afterMethod is not actual tests.

    @BeforeMethod                       //runs once before @test
    public void SetupMethod() {
        System.out.println("Before Method, Open chrome");
    }
    // usually we create this beforeMethod to open browsers before the actual test

    @AfterMethod                        //runs once after @test
    public void tearDownTest() {
        System.out.println("After Method, Close chrome");
    }
    // usually we create this afterMethod to close browsers after the actual test

    @BeforeClass
    public void setupMethod2() {
        System.out.println("Before class only one time at the beginning");
    }

    @AfterClass
    public void setupMethod3() {
        System.out.println("After class only one time at the end");
    }

}

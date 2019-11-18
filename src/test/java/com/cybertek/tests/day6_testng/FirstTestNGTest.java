package com.cybertek.tests.day6_testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {

    @Test
    public void Test1() {
        System.out.println("This is the first test");
    }
    @Test           // if there is no annotation, TestNG does not run this method/test.

    public void Test2() {
        System.out.println("This is the second test");
    }
    @Ignore             // to ignore a test
    public void Test3() {
        System.out.println("This is the second test");
    }
}

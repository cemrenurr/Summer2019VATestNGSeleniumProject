package com.cybertek.tests.day6_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    /*
    Assert is a class in testing, it has methods used to do assertions like when we compare values.
    assertEquals   -> take 2 parameters and compare them if they are equal or same.

   when an assertion fail, we got AssertionError
    in test ng, if one assertion fails, the rest will not be executed but ignored.
    if we still want to execute the code, we use soft assertions.
    When soft assertions fail, code will continue executing.

    assertTrue:take one argument and test if it is true
    assertFalse:take one argument and test if it is false
    execution of one test does not affect the other tests in the same class.

    before and after class methods does not depend on the failure or pass of the actual tests.
     */

    @Test
    public void Test() {
        Assert.assertEquals("One", "one");
    }

    @Test
    public void Test2() {
        Assert.assertNotEquals("one", "two");
    }
    @Test
    public void Test3() {
        Assert.assertTrue(1==1);
        Assert.assertTrue("a".equals("a"));
        String expected="Cbt";
        String actual= "C";
        Assert.assertTrue(expected.startsWith(actual));
        Assert.assertTrue(expected.contains("C"));
        Assert.assertTrue(1<0);
    }
    @Test
    public void Test4() {
        Assert.assertFalse(1<0);
    }

    @AfterMethod
    public void Test5() {
        System.out.println("Close the browser");
    }
    @Test
    public void Test6() {
        Assert.assertEquals(1,0, "NUMBERS does not match");
    }
    // we can write message in string at the end to remind us where the text is failing.
    // it only prints when test fails.
}

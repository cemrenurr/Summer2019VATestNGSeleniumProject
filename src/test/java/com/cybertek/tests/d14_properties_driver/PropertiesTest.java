package com.cybertek.tests.d14_properties_driver;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PropertiesTest {
    @Test
    public void test1(){
        String expectedbrowser="chrome";
        String actualBrowser= ConfigurationReader.get("browser");
        Assert.assertEquals(expectedbrowser,actualBrowser);

    }

}

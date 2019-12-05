package com.cybertek.tests.d14_properties_driver;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

   @Test
    public void test1() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Driver.closeDriver();
    }
}
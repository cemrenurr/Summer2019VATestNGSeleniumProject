package com.cybertek.tests.d14_properties_driver;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {
    @Test
    public void test1() {

        String s1 = Singleton.getInstance();
        String s2 = Singleton.getInstance();
        System.out.println("s1= " + s1);
        System.out.println("s2= " + s2);

    }

    @Test
    public void test2(){
        WebDriver driver= Driver.get();
        String url= ConfigurationReader.get("url");
        driver.get(url);
        Driver.closeDriver();

    }
}

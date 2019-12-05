package com.cybertek.utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * reads the properties file configuration.properties
 */
public class ConfigurationReader {
    private static Properties configfile;


   static  {
        try {
            //provides access to file
            //if exception occurs, code inside the catch block executes
            //any class related with inputoutput produces checked exceptions

            FileInputStream fileinputstream= new FileInputStream("configuration.properties");
            configfile=new Properties();
            configfile.load((fileinputstream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public static String get (String key) {
       return configfile.getProperty(key);
}

}

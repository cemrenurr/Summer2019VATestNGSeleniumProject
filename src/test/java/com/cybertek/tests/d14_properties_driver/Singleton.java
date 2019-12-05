package com.cybertek.tests.d14_properties_driver;

public class Singleton {

    //singleton class will have private constructor
    //so, nobody can create obj from this class, control the class.

    private Singleton() {
    }

    static String str;

    public static String getInstance() {
        //if str does not have value, initialize it and return.
        if (str == null) {
            System.out.println("str is null. assign value to it.");
            str = "ice cream was good";
        } else {
            System.out.println("it already has a value");
        }
        return str;
    }
}
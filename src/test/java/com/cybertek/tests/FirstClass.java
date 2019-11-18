package com.cybertek.tests;

import com.github.javafaker.Faker;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("hjhj");
        Faker faker= new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.chuckNorris().fact());
    }
}
/*
Summer2019VATestNGSeleniumProject   => name of the project
.idea   =>  specific to IntelliJ only, intelli j keeps some settings files here. leave it alone.
target. => this folder is created by maven used to keep compiled classes,
            if deleted, won't affect the program. leave it alone as well.
 pom.xml => manages the whole maven project.
 Summer2019VATestNGSeleniumProject.iml => file used by IntelliJ, do not delete.
 src => all the code come here
    main=> application code come here
        java=> for java code
        resources=> used for application data
com.cybertek => all project use the company/project names for package name.  Name goes in the reverse order of the domain.

maps.google.com             ===============>       Com.google.maps
External libraries=> where we can see our dependencies.

Create a new package: tests > new > package >name : d1_
 */
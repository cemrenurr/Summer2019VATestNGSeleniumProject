package com.cybertek.tests.intellijshortcuts;

public class review {

    public static void main(String[] args) {

        int n1 = 5, n2 = 6, n3 = 5;

        if (n1 == n2 && n2 == n3) {
            System.out.println("All are equal");
        } else if (n1 == n2) {
            System.out.println("n1=n2");
        } else if (n1 == n3) {
            System.out.println("n1=n3");
        } else if (n2 == n3) {
            System.out.println("n3=n2");
        } else {
            System.out.println("none are equal");
        }
        int A = 10, B = 20, C = 10;

        if (A == B && B == C) {
            System.out.println("ALL EQUAL");
        } else {
            if (A == B) {
                System.out.println("A=B");
            } else if (A == C) {
                System.out.println("A=C");
            } else if (B == C) {
                System.out.println("B=C");
            } else {
                System.out.println("None equal");

            }

        }


    }
}

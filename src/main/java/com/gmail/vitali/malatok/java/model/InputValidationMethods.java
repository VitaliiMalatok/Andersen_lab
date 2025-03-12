package com.gmail.vitali.malatok.java.model;

public class InputValidationMethods {

    public static void checkNumber(int n) {
        if (n > 7) {
            System.out.println("Hello");
        }
    }

    public static void checkName(String name) {
        if ("John".equals(name)) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }
    }

    public static void checkArraysValue(int[] arr) {
        System.out.print("Multiples of 3: ");
        for (int num : arr) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

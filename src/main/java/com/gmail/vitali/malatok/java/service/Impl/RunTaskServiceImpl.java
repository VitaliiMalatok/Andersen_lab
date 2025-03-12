package com.gmail.vitali.malatok.java.service.Impl;

import com.gmail.vitali.malatok.java.service.RunTaskService;

import java.util.Scanner;

import static com.gmail.vitali.malatok.java.model.InputValidationMethods.*;

public class RunTaskServiceImpl implements RunTaskService {
    @Override
    public void runTaskService() {
        Scanner scanner = new Scanner(System.in);
        // Task 1: Check if number is greater than 7
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        checkNumber(number);
        // Task 2: Check name
        System.out.print("Enter a name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        checkName(name);
        // Task 3: Find multiples of 3 in an array
        System.out.print("Enter numbers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        checkArraysValue(numbers);
        scanner.close();
    }
}


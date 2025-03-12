package com.gmail.vitali.malatok.java.service.Impl;

import com.gmail.vitali.malatok.java.service.RunTaskService;

import java.util.Scanner;

import static com.gmail.vitali.malatok.java.model.InputValidationMethods.checkName;
import static com.gmail.vitali.malatok.java.model.InputValidationMethods.checkNumber;

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
        scanner.nextLine(); // Consume the leftover newline
        String name = scanner.nextLine();
        checkName(name);
    }
}


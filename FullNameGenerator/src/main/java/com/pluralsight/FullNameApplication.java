package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  User input for the name generator
        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("(If Applicable) Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("(If Applicable) Suffix: ");
        String suffix = scanner.nextLine().trim();

// Full name generating formula
        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

// Full name outcome
        System.out.println("Full name: " + fullName);
    }
}

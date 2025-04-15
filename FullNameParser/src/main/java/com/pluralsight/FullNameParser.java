package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//  User input for the name parser
        System.out.print("Please enter your name: ");
        String input = scanner.nextLine().trim();

// Splitting the names by spaces
        String[] nameParts = input.split("\\s+");

        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

// Parsing by how many name parts have entered
        if (nameParts.length == 2) {
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            System.out.println("Please enter either 'first last' or 'first middle last'.");
            return;
        }

//Parsed full name outcome
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }

}

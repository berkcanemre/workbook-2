package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

//Input Date and parse it
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine().trim();

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate showDate = LocalDate.parse(dateInput, inputFormatter);

//Number of tickets
        System.out.print("How many tickets would you like? ");
        int ticketCount = Integer.parseInt(scanner.nextLine().trim());

// Split full name
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];

// Pluralization
        String ticketText;
        if (ticketCount == 1) {
            ticketText = "ticket";
        } else {
            ticketText = "tickets";
        }

// Outcome
        System.out.println(ticketCount + " " + ticketText + " reserved for " +
                showDate.format(outputFormatter) + " under " +
                lastName + ", " + firstName);
    }
}
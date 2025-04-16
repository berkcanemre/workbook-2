package com.pluralsight;

import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//CellPhone Class
        CellPhone phone = new CellPhone();

//User  input
        System.out.print("Please input the serial number? ");
        phone.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.print("Please input the model of the phone? ");
        phone.setModel(scanner.nextLine());

        System.out.print("Please input the carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("Please input the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("Please input the owner of the phone? ");
        phone.setOwner(scanner.nextLine());

// Phone info
        System.out.println("\nPhone Information:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

        scanner.close();
    }
}

package com.pluralsight;

import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//CellPhone Class 1
        CellPhone cellPhone1 = new CellPhone();

//User  input 1
        System.out.print("Please input the first serial number? ");
        cellPhone1.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.print("Please input the model of the first phone? ");
        cellPhone1.setModel(scanner.nextLine());

        System.out.print("Please input the first carrier? ");
        cellPhone1.setCarrier(scanner.nextLine());

        System.out.print("Please input the first phone number? ");
        cellPhone1.setPhoneNumber(scanner.nextLine());

        System.out.print("Please input the first owner of the phone? ");
        cellPhone1.setOwner(scanner.nextLine());

//CellPhone Class 2
        CellPhone cellPhone2 = new CellPhone();

//User  input 2
        System.out.print("Please input the second serial number? ");
        cellPhone2.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.print("Please input the model of the second phone? ");
        cellPhone2.setModel(scanner.nextLine());

        System.out.print("Please input the second carrier? ");
        cellPhone2.setCarrier(scanner.nextLine());

        System.out.print("Please input the second phone number? ");
        cellPhone2.setPhoneNumber(scanner.nextLine());

        System.out.print("Please input the second owner of the phone? ");
        cellPhone2.setOwner(scanner.nextLine());
//Display
        System.out.println("\nDisplaying Phones:\n");
        display(cellPhone1);
        display(cellPhone2);
//Dial
        System.out.println("\nDialing each other:\n");
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        scanner.close();
    }

// Display Method
public static void display(CellPhone phone) {
    System.out.println("Owner: " + phone.getOwner());
    System.out.println("Phone Number: " + phone.getPhoneNumber());
    System.out.println("Model: " + phone.getModel());
    System.out.println("Carrier: " + phone.getCarrier());
    System.out.println("Serial Number: " + phone.getSerialNumber());
    System.out.println("----------------------");

    }
}

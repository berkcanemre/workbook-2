package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {

// Inventory
    private static final int MAX_VEHICLES = 20;
    private static Vehicle[] vehicles = new Vehicle[MAX_VEHICLES];
    private static int vehicleCount = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        preloadVehicles();

//While loop
        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.print("Enter your command: ");
            int command = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findByMakeModel(scanner);
                    break;
                case 3:
                    findByPrice(scanner);
                    break;
                case 4:
                    findByColor(scanner);
                    break;
                case 5:
                    addVehicle(scanner);
                    break;
                case 6:
                    System.out.println("Exiting... See you at the lot!");
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }

    private static void preloadVehicles() {
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
    }

//for loop
    private static void listAllVehicles() {
        System.out.println("\n--- Vehicle List ---");
        for (int i = 0; i < vehicleCount; i++) {
            vehicles[i].displayInfo();
        }
    }

    private static void findByMakeModel(Scanner scanner) {
        System.out.print("Enter make/model to search: ");
        String search = scanner.nextLine().toLowerCase();

        System.out.println("\n--- Search Results ---");
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getMakeModel().toLowerCase().contains(search)) {
                vehicles[i].displayInfo();
            }
        }
    }

    private static void findByPrice(Scanner scanner) {
        System.out.print("Enter min price: ");
        float min = scanner.nextFloat();
        System.out.print("Enter max price: ");
        float max = scanner.nextFloat();

        System.out.println("\n--- Vehicles in Price Range ---");
        for (int i = 0; i < vehicleCount; i++) {
            float price = vehicles[i].getPrice();
            if (price >= min && price <= max) {
                vehicles[i].displayInfo();
            }
        }
    }

    private static void findByColor(Scanner scanner) {
        System.out.print("Enter color to search: ");
        String searchColor = scanner.nextLine().toLowerCase();

        System.out.println("\n--- Vehicles Matching Color ---");
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getColor().toLowerCase().contains(searchColor)) {
                vehicles[i].displayInfo();
            }
        }
    }

    private static void addVehicle(Scanner scanner) {
        if (vehicleCount >= MAX_VEHICLES) {
            System.out.println("Inventory full!");
            return;
        }

        System.out.print("Enter vehicle ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter odometer reading: ");
        int odometer = scanner.nextInt();

        System.out.print("Enter price: ");
        float price = scanner.nextFloat();

        vehicles[vehicleCount++] = new Vehicle(id, makeModel, color, odometer, price);
        System.out.println("Vehicle added successfully!");
    }
}
package com.mycompany.smarthub;

import java.util.Scanner;

public class SmartHub {
    public static void main(String[] args) {
        SmartDevice[] devices = {
            new SmartLight("Living Room Light"),
            new Thermostat("Home Thermostat"),
            new SecurityCamera("Front Door Camera"),
            new SmartSpeaker("Kitchen Speaker"),
            new SmartLock("Front Door Lock"),
            new SecurityFloodlight("Backyard Floodlight"),
        };

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSmart Hub Menu:");
            for (int i = 0; i < devices.length; i++) {
                System.out.println((i + 1) + ". " + devices[i].getName());
            }
            System.out.println("0. Exit");
            System.out.print("Select a device: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 0) {
                break;
            } else if (choice > 0 && choice <= devices.length) {
                SmartDevice device = devices[choice - 1];
                System.out.println("\nSelected: " + device.getName());
                System.out.println("1. View State");
                System.out.println("2. Modify Settings");
                System.out.println("3. Execute");
                System.out.print("Choose an action: ");
                int action = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (action) {
                    case 1:
                        device.viewState();
                        break;
                    case 2:
                        device.modifySettings(scanner);
                        break;
                    case 3:
                        device.execute();
                        break;
                    default:
                        System.out.println("Invalid action.");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
        System.out.println("Exiting Smart Hub.");
    }
}
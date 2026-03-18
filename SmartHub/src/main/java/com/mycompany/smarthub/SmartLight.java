package com.mycompany.smarthub;

import java.util.Scanner;

public class SmartLight implements SmartDevice {
    private String name;
    private int brightness;
    private String color;

    public SmartLight(String name) {
        this.name = name;
        this.brightness = 100;
        this.color = "White";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void viewState() {
        System.out.println("Brightness: " + brightness + ", Color: " + color);
    }

    @Override
    public void modifySettings(Scanner scanner) {
        System.out.print("Enter brightness (0-100): ");
        brightness = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter color: ");
        color = scanner.nextLine();
    }

    @Override
    public void execute() {
        System.out.println("SmartLight is set to full brightness.");
        brightness = 100;
    }
}
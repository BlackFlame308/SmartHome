package com.mycompany.smarthub;

import java.util.Scanner;

public class Thermostat implements SmartDevice {
    private String name;
    private int currentTemp;
    private int targetTemp;

    public Thermostat(String name) {
        this.name = name;
        this.currentTemp = 22;
        this.targetTemp = 22;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void viewState() {
        System.out.println("Current Temp: " + currentTemp + ", Target Temp: " + targetTemp);
    }

    @Override
    public void modifySettings(Scanner scanner) {
        System.out.print("Enter target temperature (16-30): ");
        int temp = scanner.nextInt();
        if (temp >= 16 && temp <= 30) {
            targetTemp = temp;
        } else {
            System.out.println("Invalid temperature. Must be between 16 and 30.");
        }
    }

    @Override
    public void execute() {
        System.out.println("Thermostat is activating target temperature: " + targetTemp);
        currentTemp = targetTemp;
    }
}
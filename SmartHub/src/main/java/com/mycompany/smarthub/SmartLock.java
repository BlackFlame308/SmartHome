package com.mycompany.smarthub;

import java.util.Scanner;

public class SmartLock implements SmartDevice {
    private String name;
    private boolean locked;
    private String pin;

    public SmartLock(String name) {
        this.name = name;
        this.locked = true;
        this.pin = "1234"; // Default PIN
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void viewState() {
        System.out.println("Locked: " + locked);
    }

    @Override
    public void modifySettings(Scanner scanner) {
        System.out.print("Enter new PIN: ");
        pin = scanner.nextLine();
    }

    @Override
    public void execute() {
        System.out.println("SmartLock is now locked.");
        locked = true;
    }
}
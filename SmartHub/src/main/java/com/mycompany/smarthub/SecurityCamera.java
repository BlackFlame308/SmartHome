package com.mycompany.smarthub;

import java.util.Scanner;

public class SecurityCamera implements SmartDevice {
    private String name;
    private boolean powerState;
    private boolean recordingState;

    public SecurityCamera(String name) {
        this.name = name;
        this.powerState = false;
        this.recordingState = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void viewState() {
        System.out.println("Power: " + (powerState ? "On" : "Off") + ", Recording: " + (recordingState ? "On" : "Off"));
    }

    @Override
    public void modifySettings(Scanner scanner) {
        System.out.print("Turn power on? (true/false): ");
        powerState = scanner.nextBoolean();
    }

    @Override
    public void execute() {
        if (powerState) {
            recordingState = true;
            System.out.println("SecurityCamera started recording.");
        } else {
            System.out.println("SecurityCamera is off. Cannot record.");
        }
    }
}
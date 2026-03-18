package com.mycompany.smarthub;

import java.util.Scanner;

public class SmartSpeaker implements SmartDevice {
    private String name;
    private int volume;
    private String currentTrack;

    public SmartSpeaker(String name) {
        this.name = name;
        this.volume = 50;
        this.currentTrack = "No track playing";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void viewState() {
        System.out.println("Volume: " + volume + ", Current Track: " + currentTrack);
    }

    @Override
    public void modifySettings(Scanner scanner) {
        System.out.print("Enter volume (0-100): ");
        volume = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter current track: ");
        currentTrack = scanner.nextLine();
    }

    @Override
    public void execute() {
        System.out.println("SmartSpeaker is resuming playback of: " + currentTrack);
    }
}
package com.mycompany.smarthub;

import java.util.Scanner;

public interface SmartDevice {
    String getName();
    void viewState();
    void modifySettings(Scanner scanner);
    void execute();
}

package com.mycompany.smarthub;
import java.util.Scanner;
import com.mycompany.smarthub.SmartLight; // Ensure SmartLight is imported

public class SecurityFloodlight extends SmartLight {
    private String motionSensitivity;

    public SecurityFloodlight(String name) {
        super(name);
        this.motionSensitivity = "MEDIUM";
    }

    @Override
    public void viewState() {
        super.viewState();
        System.out.println("Motion Sensitivity: " + motionSensitivity);
    }

    @Override
    public void modifySettings(Scanner scanner) {
        super.modifySettings(scanner);
        System.out.print("Enter motion sensitivity (LOW/MEDIUM/HIGH): ");
        motionSensitivity = scanner.nextLine().toUpperCase();
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("SecurityFloodlight is armed with motion detection.");
    }
}
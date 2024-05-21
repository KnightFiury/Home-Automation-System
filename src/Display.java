import java.util.*;

class Display {
    public static void displayDeviceInfo(List<Device> devices) {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("| %-25s | %-20s | %-15s | %-15s |\n", "Device Name", "Status", "Additional Info", "Additional Info");
        System.out.println("----------------------------------------------------------------------------------------");

        for (Device device : devices) {
            String status = device.isOn() ? "On" : "Off";
            String additionalInfo1 = "", additionalInfo2 = "";

            if (device instanceof Light) {
                additionalInfo1 = "Brightness";
                additionalInfo2 = Integer.toString(((Light) device).getBrightness()) + "%";
            } else if (device instanceof Thermostat) {
                additionalInfo1 = "Temperature";
                additionalInfo2 = Integer.toString(((Thermostat) device).getTemperature()) + "°C";
            } else if (device instanceof SecurityCamera) {
                additionalInfo1 = "Recording";
                additionalInfo2 = ((SecurityCamera) device).isRecording() ? "Yes" : "No";
            } else if (device instanceof SmartLock) {
                additionalInfo1 = "Lock Status";
                additionalInfo2 = ((SmartLock) device).isLocked() ? "Locked" : "Unlocked";
            } else if (device instanceof Router) {
                additionalInfo1 = "IP Address";
                additionalInfo2 = ((Router) device).getIpAddress();
            } else if (device instanceof Refrigerator) {
                additionalInfo1 = "Temperature";
                additionalInfo2 = Integer.toString(((Refrigerator) device).getTemperature()) + "°C";
            } else if (device instanceof MicrowaveOven) {
                additionalInfo1 = "Power Level";
                additionalInfo2 = Integer.toString(((MicrowaveOven) device).getPowerLevel()) + "%";
            } else if (device instanceof Television) {
                additionalInfo1 = "Volume";
                additionalInfo2 = Integer.toString(((Television) device).getVolume());
            }

            System.out.printf("| %-25s | %-20s | %-15s | %-15s |\n", device.getName(), status, additionalInfo1, additionalInfo2);
        }

    System.out.println("----------------------------------------------------------------------------------------");
    }
}
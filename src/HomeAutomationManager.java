import java.util.*;

class HomeAutomationManager {
    List<Device> devices;
    Map<String, String> userRoles;

    public HomeAutomationManager() {
        this.devices = new ArrayList<>();
        this.userRoles = new HashMap<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    public void performActions() {
        for (Device device : devices) {
            device.performAction();
        }
    }

    public void turnOnAllDevices() {
        for (Device device : devices) {
            device.turnOn();
        }
        Display.displayDeviceInfo(devices);
    }

    public void turnOffAllDevices() {
        for (Device device : devices) {
            device.turnOff();
        }
        Display.displayDeviceInfo(devices);
    }

    public void addUserRole(String username, String role) {
        userRoles.put(username, role);
    }

    public boolean hasPermission(String username, String permission) {
        String role = userRoles.get(username);
        if (role != null) {
            return true; 
        }
        return false;
    }
}

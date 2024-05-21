import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        HomeAutomationManager automationManager = new HomeAutomationManager();
        Light livingRoomLight = new Light("Living Room Light");
        Thermostat livingRoomThermostat = new Thermostat("Living Room Thermostat");
        SecurityCamera frontDoorCamera = new SecurityCamera("Front Door Camera");
        SmartLock frontDoorLock = new SmartLock("Front Door Lock");
        Router wifiRouter = new Router("WiFi Router");
        Refrigerator kitchenRefrigerator = new Refrigerator("Kitchen Refrigerator");
        MicrowaveOven kitchenMicrowaveOven = new MicrowaveOven("Kitchen Microwave Oven");
        Television livingRoomTelevision = new Television("Living Room Television");
        ArtWork art = new ArtWork();

        automationManager.addDevice(livingRoomLight);
        automationManager.addDevice(livingRoomThermostat);
        automationManager.addDevice(frontDoorCamera);
        automationManager.addDevice(frontDoorLock);
        automationManager.addDevice(wifiRouter);
        automationManager.addDevice(kitchenRefrigerator);
        automationManager.addDevice(kitchenMicrowaveOven);
        automationManager.addDevice(livingRoomTelevision);

        clearScreen(); 
        art.draw(1);
        Scanner scanner = new Scanner(System.in);
        String username, password;
        boolean authenticated = false;
        do {
            System.out.print("\nEnter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            authenticated = UserAuthentication.authenticate(username, password);
            if (!authenticated) {
                System.out.println("Authentication failed. Please try again.");
            }
        } while (!authenticated);
        System.out.println("Authentication successful. Welcome, " + username + "!");
        try {
            TimeUnit.MILLISECONDS.sleep(1500);
        } catch (InterruptedException e) {}


        int choice1, choice2;
        int amount;
        String yesOrno, data;
        do {
            clearScreen(); 
            Display.displayDeviceInfo(automationManager.devices);
            showMenu();
            choice1 = scanner.nextInt();

            switch (choice1) {
                case 1:
                    System.out.println("Enter Brightness Amount: ");
                    amount = scanner.nextInt();
                    livingRoomLight.setBrightness(amount);                
                break;
                case 2:
                    System.out.println("Enter Temparature Amount: ");
                    amount = scanner.nextInt();
                    livingRoomThermostat.setTemperature(amount);
                    break;
                case 3:
                    if(frontDoorCamera.isRecording()) {
                        System.out.println("Stop Recording? (y/n)   ");
                    } else {
                        System.out.println("Start Recording? (y/n)");
                    }
                    scanner.nextLine();
                    yesOrno = scanner.nextLine();
                    if(frontDoorCamera.isRecording() && yesOrno.equals("y")) {
                        frontDoorCamera.stopRecording();
                    } else if(!frontDoorCamera.isRecording() && yesOrno.equals("y")) {
                        frontDoorCamera.startRecording();
                    }
                    break;
                case 4:
                    if(frontDoorLock.isLocked()) {
                        System.out.println("Unlock Door? (y/n)");
                    } else {
                        System.out.println("Lock Door? (y/n)    ");
                    }
                    scanner.nextLine();
                    yesOrno = scanner.nextLine();
                    if(frontDoorLock.isLocked() && yesOrno.equals("y")) {
                        frontDoorLock.unlock();
                    } else if(!frontDoorLock.isLocked() && yesOrno.equals("y")) {
                        frontDoorLock.lock();
                    }
                    break;
                case 5:
                    if(!wifiRouter.isOn()) {
                        System.out.println("Turn On Router? (y/n)   ");
                    } else {
                        System.out.println("Turn Off Router? (y/n)    ");
                    }
                    scanner.nextLine();
                    yesOrno = scanner.nextLine();
                    if(wifiRouter.isOn() && yesOrno.equals("y")) {
                        wifiRouter.turnOff();
                    } else if(!wifiRouter.isOn() && yesOrno.equals("y")) {
                        wifiRouter.turnOn();
                    }
                    break;
                case 6:
                    System.out.println("Enter Refrigerartor Temperature: ");
                    amount = scanner.nextInt();
                    kitchenRefrigerator.setTemperature(amount);
                    break;
                case 7:
                    System.out.println("Enter Microwave Power: ");
                    amount = scanner.nextInt();
                    kitchenMicrowaveOven.setPowerLevel(amount);
                    break;
                case 8:
                    System.out.println("Enter Television Volume: ");
                    amount = scanner.nextInt();
                    livingRoomTelevision.setVolume(amount);
                    break;
                case 9:
                    frontDoorCamera.stopRecording();
                    frontDoorLock.unlock();
                    automationManager.turnOffAllDevices();
                    break;
                case 10:
                    do {
                        clearScreen();
                        art.draw(2);
                        showSettingsMenu();
                        choice2 = scanner.nextInt();

                        switch (choice2) {
                            case 1:
                            scanner.nextLine();
                            do {
                                System.out.print("\nEnter username: ");
                                username = scanner.nextLine();
                                System.out.print("Enter password: ");
                                password = scanner.nextLine();
                                authenticated = UserAuthentication.authenticate(username, password);
                                if (!authenticated) {
                                    System.out.println("Authentication failed. Please try again.");
                                }
                            } while (!authenticated);
                            System.out.println("Authentication successful...!");
                            try {
                                TimeUnit.MILLISECONDS.sleep(1000);
                            } catch (InterruptedException e) {}
                                clearScreen();
                                System.out.println("Enter New USERNAME: ");
                                username = scanner.nextLine();
                                System.out.println("Enter New PASWORD:  ");
                                password = scanner.nextLine();
                                UserAuthentication.changeCredinate(username, password);
                                System.out.println("Restarting...!");
                                try {
                                    TimeUnit.MILLISECONDS.sleep(1500);
                                } catch (InterruptedException e) {}
                                main(new String[0]);
                                break;
                            case 2:
                                System.out.println("Enter New IP Address of Router: ");
                                scanner.nextLine();
                                data = scanner.nextLine();
                                wifiRouter.setIpAddress(data);
                                try {
                                    TimeUnit.MILLISECONDS.sleep(1000);
                                } catch (InterruptedException e) {}
                                break;
                            case 3:

                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                break;
                        }
                    } while (choice2 != 4);
                    break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 11.");
            }
        } while (choice1 != 11);
        System.out.println("System Closed...!");
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("\nChoose an action:");
        System.out.println("1.  Set brightness of Living Room Light");
        System.out.println("2.  Set temperature of Living Room Thermostat");
        System.out.println("3.  Start/Stop recording for Front Door Camera");
        System.out.println("4.  Lock/Unlock Front Door Lock");
        System.out.println("5.  Turn On/Off WiFi Router");
        System.out.println("6.  Set temperature of Kitchen Refrigerator");
        System.out.println("7.  Set power level of Kitchen Microwave Oven");
        System.out.println("8.  Set volume of Living Room Television");
        System.out.println("9.  Turn off all devices");
        System.out.println("10. Open Settings");
        System.out.println("11. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void showSettingsMenu() {
        System.out.println("\nChoose an action:");
        System.out.println("1. Change Username & Pasword");
        System.out.println("2. Set Router IP Address");
        System.out.println("3. Remove Device");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
}
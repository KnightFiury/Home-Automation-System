class Router extends Device {
    private String ipAddress;

    public Router(String name) {
        super(name);
        this.ipAddress = "192.168.0.1"; 
    }

    public boolean isOn() {
        return super.isOn;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        System.out.println("IP address set to " + ipAddress + " for " + getName() + ".");
    }

    public String getIpAddress() {
        return ipAddress;
    }

    @Override
    public void performAction() {
        System.out.println("Router action performed.");
    }

    @Override
    public void displayState() {
        System.out.println("Current IP address of " + getName() + ": " + ipAddress);
    }
}

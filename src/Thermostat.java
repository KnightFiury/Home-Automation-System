class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 20; 
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean isOn() {
        return super.isOn;
    }

    public void setTemperature(int temperature) {
        super.isOn = true;
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + " degrees Celsius.");
    }

    @Override
    public void performAction() {
        System.out.println("Thermostat action performed.");
    }

    @Override
    public void displayState() {
        System.out.println("Current temperature of " + getName() + ": " + temperature + " degrees Celsius");
    }
}

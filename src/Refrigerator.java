class Refrigerator extends Device {
    private int temperature;

    public Refrigerator(String name) {
        super(name);
        this.temperature = 4; 
    }

    public void setTemperature(int temperature) {
        super.isOn = true;
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + " degrees Celsius for " + getName() + ".");
    }

    public boolean isOn() {
        return super.isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void performAction() {
        System.out.println("Refrigerator action performed.");
    }

    @Override
    public void displayState() {
        System.out.println("Current temperature of " + getName() + ": " + temperature + " degrees Celsius");
    }
}

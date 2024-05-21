class MicrowaveOven extends Device {
    private int powerLevel;

    public MicrowaveOven(String name) {
        super(name);
        this.powerLevel = 50; 
    }

    public boolean isOn() {
        return super.isOn;
    }

    public void setPowerLevel(int powerLevel) {
        super.isOn = true;
        this.powerLevel = powerLevel;
        System.out.println("Power level set to " + powerLevel + "% for " + getName() + ".");
    }

    @Override
    public void performAction() {
        System.out.println("Microwave oven action performed.");
    }

    @Override
    public void displayState() {
        System.out.println("Current power level of " + getName() + ": " + powerLevel + "%");
    }

    public int getPowerLevel() {
        return powerLevel;
    }
}
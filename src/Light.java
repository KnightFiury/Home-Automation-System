class Light extends Device {
    private int brightness; 

    public Light(String name) {
        super(name);
        this.brightness = 50; 
    }

    public int getBrightness() {
        return brightness;
    }

    public boolean isOn() {
        return super.isOn;
    }

    public void setBrightness(int brightness) {
        super.isOn = true;
        this.brightness = brightness;
        System.out.println("Brightness of " + getName() + " set to " + brightness + "%.");
    }

    @Override
    public void performAction() {
        System.out.println("Light action performed.");
    }

    @Override
    public void displayState() {
        System.out.println("Current brightness of " + getName() + ": " + brightness + "%");
    }
}

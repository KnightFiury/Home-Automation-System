class Television extends Device {
    private int volume;

    public Television(String name) {
        super(name);
        this.volume = 50; 
    }

    public boolean isOn() {
        return super.isOn;
    }

    public void setVolume(int volume) {
        super.isOn = true;
        this.volume = volume;
        System.out.println("Volume set to " + volume + " for " + getName() + ".");
    }

    @Override
    public void performAction() {
        System.out.println("Television action performed.");
    }

    @Override
    public void displayState() {
        System.out.println("Current volume of " + getName() + ": " + volume);
    }

    public int getVolume() {
        return volume;
    }
}

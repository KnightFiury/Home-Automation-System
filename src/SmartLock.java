class SmartLock extends Device {
    private boolean isLocked; 

    public SmartLock(String name) {
        super(name);
        this.isLocked = true; 
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        super.isOn = true;
        isLocked = true;
        System.out.println(name + " is locked.");
    }

    public void unlock() {
        super.isOn = false;
        isLocked = false;
        System.out.println(name + " is unlocked.");
    }

    @Override
    public void performAction() {
        System.out.println("Smart lock action performed.");
    }

    @Override
    public void displayState() {
        System.out.println("Current lock status of " + getName() + ": " + (isLocked ? "Locked" : "Unlocked"));
    }
}

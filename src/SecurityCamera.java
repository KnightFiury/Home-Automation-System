class SecurityCamera extends Device {
    private boolean isRecording; 

    public SecurityCamera(String name) {
        super(name);
        this.isRecording = false; 
    }

    public void startRecording() {
        super.isOn = true;
        isRecording = true;
        System.out.println("Recording started for " + getName() + ".");
    }

    public void stopRecording() {
        isRecording = false;
        System.out.println("Recording stopped for " + getName() + ".");
    }

    public boolean isOn() {
        return super.isOn;
    }

    public boolean isRecording() {
        return isRecording;
    }

    @Override
    public void performAction() {
        System.out.println("Security camera action performed.");
    }

    @Override
    public void displayState() {
        System.out.println("Current recording status of " + getName() + ": " + (isRecording ? "Recording" : "Not Recording"));
    }
}

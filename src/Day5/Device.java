package Day5;

public class Device {
    private boolean isOn;

    public Device() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }
}

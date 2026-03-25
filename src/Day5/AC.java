package Day5;

public class AC extends Device{
    private int temperature;

    private int minTemperature = 16;
    private int maxTemperature = 30;

    public AC(){
        super();
        this.temperature = minTemperature;
    }

    public void turnOn(){
        super.turnOn();
    }

    public void turnOff(){
        super.turnOff();
    }

    public int getTemperature(){
        return temperature;
    }

    public void increaseTemperature(){
        if (!this.isOn()) {System.out.println("AC is off and can't be increased "); return;}
        if (this.temperature >= this.maxTemperature) {System.out.printf("Maximum temperature is %d is reached %n", this.maxTemperature); return;}

        this.temperature++;
    }

    public void reduceTemperature(){
        if (!this.isOn()) {System.out.println("AC is off and can't be reduced "); return;}
        if (this.temperature <= this.minTemperature) {System.out.printf("Minimum temperature is %d is reached %n", this.minTemperature); return;}

        this.temperature--;
    }
}

package Day5;

public class Bike {
    private int gear;
    private int speed;
    private boolean isOn;

    public Bike() {
        this.gear = 0;
        this.speed = 0;
        this.isOn = false;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        if (isOn) System.out.println("Bike is already on");
        this.gear = 1;
        this.isOn = true;
    }

    public void turnOff() {
        if (!isOn) System.out.println("Bike is already off");
        this.gear = 0;
        this.speed = 0;
        this.isOn = false;
    }

    public void accelerate() {
        if (!isOn) {System.out.println("Bike is off and can't be accelerated "); return;}
        switch (this.gear) {
            case 1-> this.speed ++;
            case 2-> this.speed += 2;
            case 3-> this.speed += 3;
            case 4-> this.speed += 4;
        }
        this.updateGear();
    }

    public void updateGear() {
        if (this.speed <= 20) this.gear = 1;
        else if (this.speed <= 30) this.gear = 2;
        else if (this.speed <= 40) this.gear = 3;
        else this.gear = 4;
    }

    public void decelerate() {
        if (!isOn()) {System.out.println("Bike is off and can't be decelerated"); return;}
        if (this.speed == 0) {System.out.println("Speed cannot go beyond zero"); return;}
        switch (this.gear) {
            case 1-> this.speed --;
            case 2-> this.speed -= 2;
            case 3-> this.speed -= 3;
            case 4-> this.speed -= 4;
        }
        this.updateGear();
    }


}

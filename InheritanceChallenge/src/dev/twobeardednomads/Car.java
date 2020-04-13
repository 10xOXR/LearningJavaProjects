package dev.twobeardednomads;

public class Car extends Vehicle {

    private int steeringWheel;
    private int gears;
    private int windows;
    private int currentGear = 1;

    public Car(int doors, int seats, int steeringWheel, int gears, int windows) {
        super(true, true, "Diesel", 4, doors, seats);
        this.steeringWheel = steeringWheel;
        this.gears = gears;
        this.windows = windows;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }

    public int getGears() {
        return gears;
    }

    public int getWindows() {
        return windows;
    }

    public void shiftUpGear(int gear) {
        if (gear <= this.gears) {
            this.currentGear++;
            System.out.println("Upshifted. Current gear is " + this.currentGear);
        } else System.out.println("Can't shift. Maximum gear of " + this.gears + "reached");
    }

    public void shiftDownGear(int gear) {
        if (this.currentGear == 1) {
            System.out.println("Can't shift. Minimum gear of " + this.currentGear + " reached");
        } else {
            this.currentGear--;
            System.out.println("Downshifted. Current gear is " + this.currentGear);
        }
    }

    @Override
    public void move(int speed) {
        System.out.println("Car now moving at " + speed + " kph");
    }
}

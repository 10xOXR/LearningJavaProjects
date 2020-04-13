package dev.twobeardednomads;

public class Vehicle {

    private boolean hasEngine;
    private boolean hasBody;
    private String engineType;
    private int wheels;
    private int doors;
    private int seats;

    public Vehicle(boolean hasEngine, boolean hasBody, String engineType, int wheels, int doors, int seats) {
        this.hasEngine = hasEngine;
        this.hasBody = hasBody;
        this.engineType = engineType;
        this.wheels = wheels;
        this.doors = doors;
        this.seats = seats;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public boolean isHasBody() {
        return hasBody;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public void move(int speed) {
        System.out.println("Vehicle now moving at " + speed + "kph.");
    }
}

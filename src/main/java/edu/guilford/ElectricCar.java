package edu.guilford;

public class ElectricCar extends Car {
    private int batteryCapacity;
    private int batteryRange;
    
    // constructor
    public ElectricCar(String make, String model, int year, int batteryCapacity, int batteryRange) {
        super();
        this.batteryCapacity = batteryCapacity;
        this.batteryRange = batteryRange;
    }

    // getters and setters

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        this.batteryRange = batteryCapacity * 3;
    }

    public int getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }

    

    
}
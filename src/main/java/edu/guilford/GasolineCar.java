package edu.guilford;

public class GasolineCar extends Car {
    private int fuelCapacity;
    private String fuelType;
    
    // constructor
    public GasolineCar(String make, String model, int year, int fuelCapacity) {
        super();
        this.fuelCapacity = fuelCapacity;
        this.fuelType = fuelType;
    }
    
    // getter and setter for fuelCapacity
    public int getFuelCapacity() {
        return fuelCapacity;
    }
    
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    // getter and setter for fuelType
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
        if (fuelType.equals("regular")) {
            this.fuelCapacity = 10;
        } else if (fuelType.equals("midgrade")) {
            this.fuelCapacity = 12;
        } else if (fuelType.equals("premium")) {
            this.fuelCapacity = 15;
        }
    }
}


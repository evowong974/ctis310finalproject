package edu.guilford;

import java.util.Random;

public class Car {
    Random rand = new Random();
    private String make;
    private String model;
    private int year;
    
    // constructor
     // Choose a random brand from the list of 5 car brands
     public Car() {
        String[] carMakes = {"Toyota", "Honda", "Ford", "Tesla", "Chevrolet"};
            make = carMakes[rand.nextInt(carMakes.length)];

        // Choose a random model from the list of 5 car models
        String[] carModels = {"Camry", "Civic", "F-150", "Model 3", "Silverado"};
            model = carModels[rand.nextInt(carModels.length)];
            
            // Conditional statements to assign the random car model based on the random car make
            if (make.equals("Toyota")) {
                String[] toyotaModels = {"Camry", "Corolla", "RAV4", "Highlander", "Tacoma"};
                model = toyotaModels[rand.nextInt(toyotaModels.length)];
            } else if (make.equals("Honda")) {
                String[] hondaModels = {"Civic", "Accord", "CR-V", "Pilot", "Odyssey"};
                model = hondaModels[rand.nextInt(hondaModels.length)];
            } else if (make.equals("Ford")) {
                String[] fordModels = {"F-150", "F-250", "F-350", "F-450", "F-550"};
                model = fordModels[rand.nextInt(fordModels.length)];
            } else if (make.equals("Tesla")) {
                String[] teslaModels = {"Model 3", "Model S", "Model X", "Model Y", "Cybertruck"};
                model = teslaModels[rand.nextInt(teslaModels.length)];
            } else if (make.equals("Chevrolet")) {
                String[] chevroletModels = {"Silverado", "Colorado", "Tahoe", "Suburban", "Corvette"};
                model = chevroletModels[rand.nextInt(chevroletModels.length)];
            }
     }
    // getters and setters
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
}






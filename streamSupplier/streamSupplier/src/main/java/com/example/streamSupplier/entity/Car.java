package com.example.streamSupplier.entity;


public class Car {

    private String name;
    private String motor;
    private String fuel;

    public Car(String name, String motor, FuelType fuelType) {
        this.name = name;
        this.motor = motor;
        this.fuel = fuelType.name();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getFuel() { return fuel; }

    public void setFuel(String fuel) { this.fuel = fuel; }
}

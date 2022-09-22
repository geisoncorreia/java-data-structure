package com.example.streamSupplier.entity;


public class Car {

    private String name;
    private String motor;

    public Car(String name, String motor) {
        this.name = name;
        this.motor = motor;
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
}

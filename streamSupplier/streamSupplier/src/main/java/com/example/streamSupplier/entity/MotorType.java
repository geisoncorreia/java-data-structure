package com.example.streamSupplier.entity;

public enum MotorType {

    ECONOMY("economy"),
    MUSCLE_CAR("muscle_car"),
    OFF_ROAD("offroad"),
    ECONOMY_ELECTRIC("economy_electric");

    private String type;

    MotorType(String type) {
        this.type = type;
    }
}

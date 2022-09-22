package com.example.streamSupplier.entity;

public enum FuelType {

    ELECTRIC("electric"),
    DIESEL("diesel"),
    GASOLINE("gasoline");

    private String type;

    FuelType(String type) {
        this.type = type;
    }
}

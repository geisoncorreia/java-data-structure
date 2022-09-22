package com.example.streamSupplier.service;

import com.example.streamSupplier.entity.Car;
import com.example.streamSupplier.entity.Engine;
import com.example.streamSupplier.entity.FuelType;

public class OffRoadService implements Engine {

    public OffRoadService() { }

    @Override public Object motorSettings(String nome) {
        return new Car(nome, "4.0", FuelType.DIESEL);
    }
}

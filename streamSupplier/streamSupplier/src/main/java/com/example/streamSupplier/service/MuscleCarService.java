package com.example.streamSupplier.service;

import com.example.streamSupplier.entity.Car;
import com.example.streamSupplier.entity.Engine;
import com.example.streamSupplier.entity.FuelType;

public class MuscleCarService implements Engine {

    public MuscleCarService() { }

    @Override public Object motorSettings(String nome) {
        return new Car(nome, "V8", FuelType.DIESEL);
    }
}

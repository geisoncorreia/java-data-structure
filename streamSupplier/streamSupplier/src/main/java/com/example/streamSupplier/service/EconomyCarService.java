package com.example.streamSupplier.service;

import com.example.streamSupplier.entity.Car;
import com.example.streamSupplier.entity.Engine;
import com.example.streamSupplier.entity.FuelType;

public class EconomyCarService implements Engine {

    public EconomyCarService() {
    }

    @Override
    public Car motorSettings(String name) {
        return new Car(name, "1.0", FuelType.ELECTRIC);
    }
}

package com.example.streamSupplier.service;

import com.example.streamSupplier.entity.Car;
import com.example.streamSupplier.entity.Engine;

public class EconomyCarService implements Engine {

    public EconomyCarService(String mustang) {
    }

    public EconomyCarService() {
    }

    @Override
    public Car motorSettings(String name) {
        return new Car("name", "1.0");
    }
}

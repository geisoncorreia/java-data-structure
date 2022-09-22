package com.example.streamSupplier.service;

import com.example.streamSupplier.entity.Car;
import com.example.streamSupplier.entity.Engine;
import com.example.streamSupplier.entity.FuelType;

public class EconomyElectricCarService implements Engine {

    public EconomyElectricCarService() {
    }

    @Override
    public Car motorSettings(String name) {
        return new Car(name, "Power Electric: 1.0", FuelType.GASOLINE);
    }
}

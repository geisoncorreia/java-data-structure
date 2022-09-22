package com.example.streamSupplier.service;

import com.example.streamSupplier.entity.Car;
import com.example.streamSupplier.entity.Engine;

public class MuscleCarService implements Engine {


    @Override public Object motorSettings(String nome) {
        return new Car("name", "5.0");
    }
}

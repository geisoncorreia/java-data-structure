package com.example.streamSupplier;

import com.example.streamSupplier.entity.Car;
import com.example.streamSupplier.entity.Engine;
import com.example.streamSupplier.service.EconomyCarService;

public class Main {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        final Car  = carFactory.build("FUSCA");
        final Car fusca = carFactory.build("MUSTANG");

        System.out.println("Car: " + fusca.getMotor());

    }
}

package com.example.streamSupplier;

import com.example.streamSupplier.entity.Car;
import com.example.streamSupplier.entity.MotorType;


public class Main {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        final Car fusca = carFactory.build("FUSCA", MotorType.ECONOMY);
        final Car opala = carFactory.build("OPALA", MotorType.MUSCLE_CAR);
        final Car F100 = carFactory.build("F100", MotorType.OFF_ROAD);
        final Car tesla = carFactory.build("tesla", MotorType.ECONOMY_ELECTRIC);


        System.out.println("Car: " + fusca.getName() + " Motor: " + fusca.getMotor());
        System.out.println("Car: " + opala.getName() + " Motor: " + opala.getMotor());
        System.out.println("Car: " + F100.getName() + " Motor: " + F100.getMotor());
        System.out.println("Car: " + tesla.getName() + " Motor: " + tesla.getMotor());

    }
}

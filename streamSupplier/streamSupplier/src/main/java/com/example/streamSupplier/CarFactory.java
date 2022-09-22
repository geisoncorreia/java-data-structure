package com.example.streamSupplier;

import com.example.streamSupplier.entity.Car;
import com.example.streamSupplier.entity.Engine;
import com.example.streamSupplier.entity.MotorType;
import com.example.streamSupplier.service.EconomyCarService;
import com.example.streamSupplier.service.EconomyElectricCarService;
import com.example.streamSupplier.service.MuscleCarService;
import com.example.streamSupplier.service.OffRoadService;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CarFactory {

    public static Map <String, Supplier<Engine>> CAR_SUPPLIER = new HashMap();

    static {
        Map <String, Supplier<Engine>> carMap = new HashMap();
        carMap.put(MotorType.ECONOMY.name(), EconomyCarService::new);
        carMap.put(MotorType.MUSCLE_CAR.name(), MuscleCarService::new);
        carMap.put(MotorType.OFF_ROAD.name(), OffRoadService::new);
        carMap.put(MotorType.ECONOMY_ELECTRIC.name(), EconomyElectricCarService::new);

        CAR_SUPPLIER = Collections.unmodifiableMap(carMap);

    }


    public Car build(String name, MotorType motorType) {
        final Supplier<Engine> iEngine = CAR_SUPPLIER.get(motorType.name());
        return (Car) iEngine.get().motorSettings(name);
    }

}

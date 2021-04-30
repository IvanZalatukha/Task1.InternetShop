package com.zalatukha.shop;

import com.zalatukha.entity.Car;
import com.zalatukha.entity.CarType;
import com.zalatukha.entity.Plane;
import com.zalatukha.entity.PlaneType;
import com.zalatukha.factory.CarFactory;
import com.zalatukha.factory.PlaneFactory;
import com.zalatukha.repository.Storage;

public class FillTheWarehouse {

    public static void fillTheWarehouse() {

        CarFactory carFactory = new CarFactory();
        PlaneFactory planeFactory = new PlaneFactory();

        Car sportCar = carFactory.createVehicle(CarType.SPORT_CAR);
        Car cityCar = carFactory.createVehicle(CarType.CITY_CAR);
        Car toyCar = carFactory.createVehicle(CarType.TOY_CAR);
        Plane militaryPlane = planeFactory.createVehicle(PlaneType.MILITARY_PLANE);
        Plane toyPlane = planeFactory.createVehicle(PlaneType.TOY_PLANE);
        Plane passengerPlane = planeFactory.createVehicle(PlaneType.PASSENGER_PLANE);

        Storage storage = Storage.getInstance();
        storage.put("sportCar", sportCar);
        storage.put("cityCar", cityCar);
        storage.put("toyCar", toyCar);
        storage.put("militaryPlane", militaryPlane);
        storage.put("toyPlane", toyPlane);
        storage.put("passengerPlane", passengerPlane);

    }
}

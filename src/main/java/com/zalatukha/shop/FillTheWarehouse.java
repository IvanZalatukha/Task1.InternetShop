package com.zalatukha.shop;

import com.zalatukha.entity.*;
import com.zalatukha.factory.CarFactory;
import com.zalatukha.factory.PlaneFactory;
import com.zalatukha.repository.Storage;

public class FillTheWarehouse {

    public static void fillTheWarehouse() {

        CarFactory carFactory = new CarFactory();
        PlaneFactory planeFactory = new PlaneFactory();

        Vehicle sportCar = carFactory.createVehicle(CarType.SPORT_CAR);
        Vehicle cityCar = carFactory.createVehicle(CarType.CITY_CAR);
        Vehicle toyCar = carFactory.createVehicle(CarType.TOY_CAR);
        Vehicle militaryPlane = planeFactory.createVehicle(PlaneType.MILITARY_PLANE);
        Vehicle toyPlane = planeFactory.createVehicle(PlaneType.TOY_PLANE);
        Vehicle passengerPlane = planeFactory.createVehicle(PlaneType.PASSENGER_PLANE);

        Storage storage = Storage.getInstance();
        storage.put("sportCar", sportCar);
        storage.put("cityCar", cityCar);
        storage.put("toyCar", toyCar);
        storage.put("militaryPlane", militaryPlane);
        storage.put("toyPlane", toyPlane);
        storage.put("passengerPlane", passengerPlane);

    }
}

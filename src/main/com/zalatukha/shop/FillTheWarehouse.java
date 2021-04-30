package main.com.zalatukha.shop;

import main.com.zalatukha.entity.*;
import main.com.zalatukha.factory.CarFactory;
import main.com.zalatukha.factory.PlaneFactory;
import main.com.zalatukha.repository.Storage;

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

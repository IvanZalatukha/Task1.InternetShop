package com.zalatukha.patterns;

import com.zalatukha.patterns.dao.ImplCarCRUD;
import com.zalatukha.patterns.entity.*;

public class Demo {

    public static void main(String[] args) {

        Car sportCar = new Car.Builder()
                .buildName("SportCar")
                .buildType(CarType.SPORT_CAR)
                .buildSeats(2)
                .buildMaxSpeed(444)
                .buildColor(VehicleColor.RED)
                .build();

        Plane militaryPlane = new Plane.Builder()
                .buildMaxHeight(2500)
                .buildColor(VehicleColor.BLUE)
                .buildName("SU35")
                .buildType(PlaneType.MILITARY_PLANE)
                .buildSeats(2)
                .build();

        ImplCarCRUD implCarCRUD = new ImplCarCRUD();

        Car newCar = new Car();
        newCar.setName("new SuperSportCar");
        newCar.setMaxSpeed(1111);

        implCarCRUD.update(1, newCar);




    }
}

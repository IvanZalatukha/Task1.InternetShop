package main.com.zalatukha.builder;

import main.com.zalatukha.entity.PlaneType;
import main.com.zalatukha.entity.VehicleColor;

public class PlaneConstructor {

    public void constructMilitaryPlane(Builder builder) {
        builder.setName("SU 35");
        builder.setType(PlaneType.MILITARY_PLANE);
        builder.setSeats(1);
        builder.setMaxSpeed(1400);
        builder.setColor(VehicleColor.BLUE);
    }

    public void constructPassengerPlane(Builder builder) {
        builder.setName("Boeing 777");
        builder.setType(PlaneType.PASSENGER_PLANE);
        builder.setSeats(301);
        builder.setMaxSpeed(905);
        builder.setColor(VehicleColor.WHITE);
    }

    public void constructToyPlane(Builder builder) {
        builder.setName("Toy plane");
        builder.setType(PlaneType.TOY_PLANE);
        builder.setSeats(0);
        builder.setMaxSpeed(10);
        builder.setColor(VehicleColor.GREEN);
    }
}

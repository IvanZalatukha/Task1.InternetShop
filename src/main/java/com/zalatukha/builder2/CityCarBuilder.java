package com.zalatukha.builder2;

import com.zalatukha.entity.CarType;
import com.zalatukha.entity.VehicleColor;

public class CityCarBuilder extends CarBuilder {
    @Override
    public void buildName() {
        car.setName("Polo");
    }

    @Override
    public void buildType() {
        car.setType(CarType.CITY_CAR);
    }

    @Override
    public void buildSeats() {
        car.setSeats(5);
    }

    @Override
    public void buildMaxSpeed() {
        car.setMaxSpeed(150);
    }

    @Override
    public void buildColor() {
        car.setColor(VehicleColor.WHITE);
    }
}

package com.zalatukha.builder2;

import com.zalatukha.entity.CarType;
import com.zalatukha.entity.VehicleColor;

public class SportCarBuilder extends CarBuilder {
    @Override
    public void buildName() {
        car.setName("Mazeratti");
    }

    @Override
    public void buildType() {
        car.setType(CarType.SPORT_CAR);
    }

    @Override
    public void buildSeats() {
        car.setSeats(2);
    }

    @Override
    public void buildMaxSpeed() {
        car.setMaxSpeed(350);
    }

    @Override
    public void buildColor() {
        car.setColor(VehicleColor.RED);
    }
}

package com.zalatukha.builder2;

import com.zalatukha.entity.Car;

public class CarCreator {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder cb) { carBuilder = cb; }
    public Car getCar() { return carBuilder.getCar(); }

    public void constructCar() {
        carBuilder.createNewCarProduct();
        carBuilder.buildName();
        carBuilder.buildType();
        carBuilder.buildSeats();
        carBuilder.buildMaxSpeed();
        carBuilder.buildColor();
    }
}

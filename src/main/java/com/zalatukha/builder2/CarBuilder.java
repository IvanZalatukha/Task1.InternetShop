package com.zalatukha.builder2;

import com.zalatukha.entity.Car;
import com.zalatukha.entity.VehicleColor;

public abstract class CarBuilder {
    protected Car car;

    public Car getCar() { return car; }
    public void createNewCarProduct() { car = new Car(); }

    public abstract void buildName();
    public abstract void buildType();
    public abstract void buildSeats();
    public abstract void buildMaxSpeed();
    public abstract void buildColor();

}

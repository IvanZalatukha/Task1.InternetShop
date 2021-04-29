package main.com.zalatukha.factory;

import main.com.zalatukha.entity.*;

public class PlaneFactory implements VehicleFactory{

    @Override
    public Plane createVehicle(String type) {
        return new Plane();
    }
}

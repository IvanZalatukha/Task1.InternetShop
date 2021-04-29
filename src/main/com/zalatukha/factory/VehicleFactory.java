package main.com.zalatukha.factory;

import main.com.zalatukha.entity.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(String type);
}

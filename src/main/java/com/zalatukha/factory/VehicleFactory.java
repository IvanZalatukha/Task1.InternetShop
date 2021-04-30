package com.zalatukha.factory;


import com.zalatukha.entity.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(Enum type);
}

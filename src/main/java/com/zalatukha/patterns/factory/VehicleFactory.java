package com.zalatukha.patterns.factory;


import com.zalatukha.patterns.entity.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(Enum type);
}

package main.com.zalatukha.factory;

import main.com.zalatukha.entity.*;

public class PlaneFactory implements VehicleFactory{

    @Override
    public Plane createVehicle(String type) {
        switch(type) {
            case "su35":
                return new PlaneSU35();
            default:
                return new RegularPlane();
        }
    }
}

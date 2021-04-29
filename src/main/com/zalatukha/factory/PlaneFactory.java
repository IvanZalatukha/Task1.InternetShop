package main.com.zalatukha.factory;

import main.com.zalatukha.builder.PlaneConstructor;
import main.com.zalatukha.builder.VehicleBuilder;
import main.com.zalatukha.entity.*;

public class PlaneFactory implements VehicleFactory{

    @Override
    public Plane createVehicle(String type) {

        PlaneConstructor planeConstructor = new PlaneConstructor();

        VehicleBuilder builder = new VehicleBuilder();

        switch(type) {
            case "toy":
                planeConstructor.constructToyPlane(builder);
                break;
            case "military":
                planeConstructor.constructMilitaryPlane(builder);
                break;
            case "passenger":
                planeConstructor.constructPassengerPlane(builder);
            default:
                planeConstructor.constructPassengerPlane(builder);
        }
        return  builder.getPlane();
    }
}

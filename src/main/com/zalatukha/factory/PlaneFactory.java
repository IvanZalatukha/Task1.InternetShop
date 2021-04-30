package main.com.zalatukha.factory;

import main.com.zalatukha.builder.PlaneConstructor;
import main.com.zalatukha.builder.VehicleBuilder;
import main.com.zalatukha.entity.*;

public class PlaneFactory implements VehicleFactory{

    @Override
    public Plane createVehicle(Enum type) {

        PlaneConstructor planeConstructor = new PlaneConstructor();

        VehicleBuilder builder = new VehicleBuilder();

        switch(PlaneType.valueOf(type.toString())) {
            case TOY_PLANE:
                planeConstructor.constructToyPlane(builder);
                break;
            case MILITARY_PLANE:
                planeConstructor.constructMilitaryPlane(builder);
                break;
            case PASSENGER_PLANE:
                planeConstructor.constructPassengerPlane(builder);
            default:
                planeConstructor.constructPassengerPlane(builder);
        }
        return  builder.getPlane();
    }


}

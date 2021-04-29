package main.com.zalatukha.factory;

import main.com.zalatukha.builder.VehicleBuilder;
import main.com.zalatukha.builder.CarConstructor;
import main.com.zalatukha.entity.Car;

public class CarFactory implements VehicleFactory {

    @Override
    public Car createVehicle(String type) {

        CarConstructor carConstructor = new CarConstructor();

        VehicleBuilder builder = new VehicleBuilder();

        switch(type) {
            case "toy":
                carConstructor.constructToyCar(builder);
                break;
            case "sport":
                carConstructor.constructSportsCar(builder);
                break;
            case "city":
                carConstructor.constructCityCar(builder);
            default:
                carConstructor.constructCityCar(builder);
        }
        return  builder.getCar();
    }
}

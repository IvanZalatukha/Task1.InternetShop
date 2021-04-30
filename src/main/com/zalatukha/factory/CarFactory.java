package main.com.zalatukha.factory;

import main.com.zalatukha.builder.VehicleBuilder;
import main.com.zalatukha.builder.CarConstructor;
import main.com.zalatukha.entity.Car;
import main.com.zalatukha.entity.CarType;

public class CarFactory implements VehicleFactory {

    @Override
    public Car createVehicle(Enum type) {

        CarConstructor carConstructor = new CarConstructor();

        VehicleBuilder builder = new VehicleBuilder();

        switch(CarType.valueOf(type.toString())) {
            case TOY_CAR:
                carConstructor.constructToyCar(builder);
                break;
            case SPORT_CAR:
                carConstructor.constructSportsCar(builder);
                break;
            case CITY_CAR:
                carConstructor.constructCityCar(builder);
            default:
                carConstructor.constructCityCar(builder);
        }
        return  builder.getCar();
    }
}

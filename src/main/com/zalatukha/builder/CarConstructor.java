package main.com.zalatukha.builder;

import main.com.zalatukha.entity.Enum;
import main.com.zalatukha.entity.VehicleColor;

public class CarConstructor {

    public void constructSportsCar(Builder builder) {
        builder.setName("Lamborghini Aventador");
        builder.setType(Enum.SPORT_CAR);
        builder.setSeats(2);
        builder.setMaxSpeed(300);
        builder.setColor(VehicleColor.RED);
    }

    public void constructCityCar(Builder builder) {
        builder.setName("Volkswagen Sharan");
        builder.setType(Enum.CITY_CAR);
        builder.setSeats(7);
        builder.setMaxSpeed(120);
        builder.setColor(VehicleColor.BLACK);
    }

    public void constructToyCar(Builder builder) {
        builder.setName("Small remote control machine");
        builder.setType(Enum.TOY_CAR);
        builder.setSeats(0);
        builder.setMaxSpeed(3);
        builder.setColor(VehicleColor.YELLOW);
    }
}

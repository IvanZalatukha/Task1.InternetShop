package main.com.zalatukha.builder;

import main.com.zalatukha.entity.Car;
import main.com.zalatukha.entity.Enum;
import main.com.zalatukha.entity.VehicleColor;

public class VehicleBuilder implements Builder {
    private String name;
    Enum type;
    int seats;
    private int maxSpeed;
    private VehicleColor color;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(Enum type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void setColor(VehicleColor color) {
        this.color = color;
    }

    public Car getResult() {
        return new Car(name, type, seats, maxSpeed, color);
    }

}

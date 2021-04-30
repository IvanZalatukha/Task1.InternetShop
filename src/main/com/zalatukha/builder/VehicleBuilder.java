package main.com.zalatukha.builder;

import main.com.zalatukha.entity.*;

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

    public Car getCar() {
        return new Car(name, (CarType) type, seats, maxSpeed, color);
    }

    public Plane getPlane() {
        return new Plane(name, (PlaneType) type, seats, maxSpeed, color);
    }


}

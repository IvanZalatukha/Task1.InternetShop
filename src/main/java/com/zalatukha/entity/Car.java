package com.zalatukha.entity;

public class Car implements Vehicle {
    private String name;
    CarType type;
    int seats;
    private int maxSpeed;
    private VehicleColor color;

    public Car(String name, CarType type, int seats, int maxSpeed, VehicleColor color) {
        this.name = name;
        this.type = type;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public Car() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(VehicleColor color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("The car is moving forward");
    }

    @Override
    public void brake() {
        System.out.println("The car is braking");
    }

    @Override
    public void takePassengers() {
        System.out.println("Passengers get into the car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", seats=" + seats +
                ", maxSpeed=" + maxSpeed +
                ", color=" + color +
                '}';
    }
}

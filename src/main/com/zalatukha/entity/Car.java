package main.com.zalatukha.entity;

public class Car implements Vehicle {
    private String name;
    CarType type;
    int seats;
    private int maxSpeed;
    private VehicleColor color;

    public Car() {
    }

    public Car(String name, CarType type, int seats, int maxSpeed, VehicleColor color) {
        this.name = name;
        this.type = type;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
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

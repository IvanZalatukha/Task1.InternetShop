package main.com.zalatukha.entity;

public class Plane implements Vehicle {
    private String name;
    PlaneType type;
    int seats;
    private int maxSpeed;
    private VehicleColor color;

    public Plane(String name, PlaneType type, int seats, int maxSpeed, VehicleColor color) {
        this.name = name;
        this.type = type;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("The plane is moving forward");
    }

    @Override
    public void brake() {
        System.out.println("The plane is landing");
    }

    @Override
    public void takePassengers() {
        System.out.println("Passengers get into the plane");
    }

}
